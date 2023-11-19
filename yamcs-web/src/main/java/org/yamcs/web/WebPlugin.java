package org.yamcs.web;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.yamcs.Experimental;
import org.yamcs.Plugin;
import org.yamcs.PluginException;
import org.yamcs.YConfiguration;
import org.yamcs.YamcsServer;
import org.yamcs.YamcsServerInstance;
import org.yamcs.http.HttpServer;
import org.yamcs.logging.Log;
import org.yamcs.management.ManagementListener;
import org.yamcs.management.ManagementService;
import org.yamcs.protobuf.YamcsInstance.InstanceState;
import org.yamcs.security.SystemPrivilege;
import org.yamcs.templating.ParseException;
import org.yamcs.yarch.Bucket;
import org.yamcs.yarch.YarchDatabase;

public class WebPlugin implements Plugin {

    static final String CONFIG_SECTION = "yamcs-web";
    static final String CONFIG_DISPLAY_BUCKET = "displayBucket";
    static final String CONFIG_STACK_BUCKET = "stackBucket";

    /**
     * Allows access to the Admin Area.
     * <p>
     * Remark that certain pages in the Admin Area may require further privileges.
     */
    public static final SystemPrivilege PRIV_ADMIN = new SystemPrivilege("web.AccessAdminArea");

    private Log log = new Log(getClass());

    private WebFileDeployer deployer;
    private AngularHandler angularHandler;

    // We need these outside of deployer because we cannot predict the order in which
    // plugins are loaded.
    private List<Path> extraStaticRoots = new ArrayList<>();
    private Map<String, Map<String, Object>> extraConfigs = new HashMap<>();

    @Override
    public void onLoad(YConfiguration config) throws PluginException {
        var yamcs = YamcsServer.getServer();
        yamcs.getSecurityStore().addSystemPrivilege(PRIV_ADMIN);

        var httpServer = yamcs.getGlobalService(HttpServer.class);
        var contextPath = httpServer.getContextPath();

        createBuckets(config);

        try {
            deployer = new WebFileDeployer(config, contextPath, extraStaticRoots, extraConfigs);
            setupRoutes(config, deployer);
        } catch (IOException | ParseException e) {
            throw new PluginException("Could not deploy website", e);
        }

        // Print these log statements via a ready listener because it is more helpful
        // if they appear at the end of the boot log.
        yamcs.addReadyListener(() -> {
            for (var binding : httpServer.getBindings()) {
                log.info("Website deployed at {}{}", binding, contextPath);
            }
        });
    }

    @Experimental
    public void addExtension(String id, Map<String, Object> config, Path staticRoot) {
        extraConfigs.put(id, config);
        extraStaticRoots.add(staticRoot);
        if (deployer != null) { // Trigger deploy, if deployer is already available
            deployer.setExtraSources(extraStaticRoots, extraConfigs);
            angularHandler.setStaticRoots(Stream.concat(
                    Stream.of(deployer.getDirectory()),
                    deployer.getExtraStaticRoots().stream())
                    .collect(Collectors.toList()));
        }
    }

    private void createBuckets(YConfiguration config) throws PluginException {
        var displayBucketName = config.getString(CONFIG_DISPLAY_BUCKET);
        createBucketIfNotExists(displayBucketName);

        var stackBucketName = config.getString(CONFIG_STACK_BUCKET);
        createBucketIfNotExists(stackBucketName);

        // Buckets can be overriden at instance level. If so, create those
        // buckets here. It is this WebPlugin that owns them.
        ManagementService.getInstance().addManagementListener(new ManagementListener() {
            @Override
            public void instanceStateChanged(YamcsServerInstance ysi) {
                if (ysi.state() == InstanceState.STARTING) {
                    var instanceConfig = ysi.getConfig().getConfigOrEmpty(CONFIG_SECTION);
                    if (instanceConfig.containsKey(CONFIG_DISPLAY_BUCKET)) {
                        var bucketName = instanceConfig.getString(CONFIG_DISPLAY_BUCKET);
                        try {
                            createBucketIfNotExists(bucketName);
                        } catch (PluginException e) {
                            log.error("Could not create display bucket for instance '" + ysi.getName() + "'", e);
                        }
                    }
                    if (instanceConfig.containsKey(CONFIG_STACK_BUCKET)) {
                        var bucketName = instanceConfig.getString(CONFIG_STACK_BUCKET);
                        try {
                            createBucketIfNotExists(bucketName);
                        } catch (PluginException e) {
                            log.error("Could not create stack bucket for instance '" + ysi.getName() + "'", e);
                        }
                    }
                }
            }
        });
    }

    private Bucket createBucketIfNotExists(String bucketName) throws PluginException {
        var yarch = YarchDatabase.getInstance(YamcsServer.GLOBAL_INSTANCE);
        try {
            var bucket = yarch.getBucket(bucketName);
            if (bucket == null) {
                bucket = yarch.createBucket(bucketName);
            }
            return bucket;
        } catch (IOException e) {
            throw new PluginException("Could not create '" + bucketName + "' bucket", e);
        }
    }

    /**
     * Add routes used by Web UI.
     */
    private void setupRoutes(YConfiguration config, WebFileDeployer deployer)
            throws PluginException {
        var httpServer = YamcsServer.getServer().getGlobalService(HttpServer.class);

        angularHandler = new AngularHandler(
                config,
                httpServer,
                deployer.getDirectory(),
                deployer.getExtraStaticRoots());
        httpServer.addRoute("*", () -> angularHandler);

        // Additional API Routes
        try (var in = getClass().getResourceAsStream("/yamcs-web.protobin")) {
            httpServer.getProtobufRegistry().importDefinitions(in);
        } catch (IOException e) {
            throw new PluginException(e);
        }
        httpServer.addApi(new WebApi());
    }
}
