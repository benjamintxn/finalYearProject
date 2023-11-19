package org.yamcs.http;

import java.util.ArrayList;
import java.util.List;

import org.yamcs.api.Observer;
import org.yamcs.http.WebSocketServerMessageHandler.InternalServerMessage;
import org.yamcs.http.WebSocketServerMessageHandler.Priority;
import org.yamcs.logging.Log;
import org.yamcs.protobuf.Reply;

import com.google.protobuf.Message;

public class WebSocketObserver implements Observer<Message> {

    private Log log;

    private final TopicContext ctx;

    private int messageCount = 0;
    private final boolean lowPriority;
    private boolean cancelled;
    private boolean completed;
    private Runnable cancelHandler;

    private boolean replied;
    private List<Message> pendingMessages = new ArrayList<>(); // Messages received while not yet replied

    public WebSocketObserver(TopicContext ctx) {
        this.ctx = ctx;
        this.lowPriority = ctx.isLowPriority();
        log = new Log(WebSocketObserver.class);
        log.setContext(ctx.toString());

        log.debug("Subscribe {}", ctx.getTopic().getName());
    }

    void sendReply(Reply reply) {
        synchronized (this) { // Guard 'replied' and 'pendingMessages'
            try {
                sendMessage("reply", reply, Priority.HIGH);
            } finally {
                replied = true;
            }

            pendingMessages.forEach(message -> next(message));
            pendingMessages.clear();
        }
    }

    /*
     * Synchronize because we may get called from different threads and messages
     * should be passed in-order to netty, matching messageCount.
     */
    @Override
    public synchronized void next(Message message) {
        if (!replied) {
            pendingMessages.add(message);
            return;
        }

        messageCount++;

        if (!ctx.nettyContext.channel().isOpen()) {
            ctx.cancel(null);
            return;
        }

        sendMessage(ctx.getTopic().getName(), message, lowPriority ? Priority.LOW : Priority.NORMAL);
    }

    private void sendMessage(String type, Message data, Priority priority) {
        ctx.nettyContext.channel()
                .writeAndFlush(new InternalServerMessage(type, ctx.getId(), messageCount, data, priority));
    }

    void cancelCall(String reason) {
        if (!cancelled) {
            if (reason != null) {
                log.debug("Cancelling {} call ({})", ctx.getTopic().getName(), reason);
            } else {
                log.debug("Cancelling {} call", ctx.getTopic().getName());
            }
            cancelled = true;
            if (cancelHandler != null) {
                cancelHandler.run();
            }
        }
    }

    @Override
    public void completeExceptionally(Throwable t) {
        if (completed) {
            throw new IllegalStateException("Observer already completed");
        }
        completed = true;
    }

    @Override
    public void complete() {
        if (completed) {
            throw new IllegalStateException("Observer already completed");
        }
        completed = true;

        if (cancelled) {
            ctx.requestFuture.complete(null);
            return;
        }
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelHandler(Runnable cancelHandler) {
        this.cancelHandler = cancelHandler;
    }
}
