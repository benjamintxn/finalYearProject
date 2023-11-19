import { ChangeDetectionStrategy, Component, OnDestroy } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { MatSnackBar } from '@angular/material/snack-bar';
import { ConnectionInfo, MessageService, Processor, ProcessorSubscription, YamcsService } from '@yamcs/webapp-sdk';
import { BehaviorSubject, Observable, Subscription } from 'rxjs';
import { AppearanceService } from '../../core/services/AppearanceService';
import { SessionExpiredDialog } from '../dialogs/SessionExpiredDialog';
import { StartReplayDialog } from './StartReplayDialog';


@Component({
  selector: 'app-instance-toolbar',
  templateUrl: './InstanceToolbar.html',
  styleUrls: ['./InstanceToolbar.css'],
  changeDetection: ChangeDetectionStrategy.OnPush,
})
export class InstanceToolbar implements OnDestroy {

  processor$ = new BehaviorSubject<Processor | null>(null);
  processorSubscription: ProcessorSubscription;

  time$: Observable<string | null>;

  connected$: Observable<boolean>;
  connectionInfo$: Observable<ConnectionInfo | null>;
  zenMode$: Observable<boolean>;

  // For use in lazy dynamic population of Switch Processor menu.
  allProcessors$ = new BehaviorSubject<Processor[]>([]);

  private connectedSubscription: Subscription;

  constructor(
    private dialog: MatDialog,
    readonly yamcs: YamcsService,
    private snackBar: MatSnackBar,
    private messageService: MessageService,
    private appearanceService: AppearanceService,
  ) {
    this.processor$.next(yamcs.getProcessor());
    if (yamcs.processor) {
      this.processorSubscription = this.yamcs.yamcsClient.createProcessorSubscription({
        instance: yamcs.instance!,
        processor: yamcs.processor,
      }, processor => {
        this.processor$.next(processor);
      });
    }

    this.connected$ = this.yamcs.yamcsClient.connected$;
    this.time$ = this.yamcs.time$;
    this.zenMode$ = appearanceService.zenMode$;

    this.connectedSubscription = this.connected$.subscribe(connected => {
      if (!connected) {
        dialog.open(SessionExpiredDialog);
      }
    });

    this.connectionInfo$ = this.yamcs.connectionInfo$;
  }

  startReplay() {
    this.dialog.open(StartReplayDialog, {
      width: '400px',
    }).afterClosed().subscribe(result => {
      if (result) {
        this.snackBar.open(`Initializing replay ${result.name}...`, undefined, {
          horizontalPosition: 'end',
        });
        this.yamcs.yamcsClient.createProcessor(result).then(() => {
          this.yamcs.switchContext(this.yamcs.instance!, result.name);
          this.snackBar.open(`Joining replay ${result.name}`, undefined, {
            duration: 3000,
            horizontalPosition: 'end',
          });
        }).catch(err => {
          this.snackBar.open(`Failed to initialize replay`, undefined, {
            duration: 3000,
            horizontalPosition: 'end',
          });
        });
      }
    });
  }

  pauseReplay() {
    this.yamcs.yamcsClient.editReplayProcessor(this.yamcs.instance!, this.yamcs.processor!, { state: 'paused' })
      .catch(err => this.messageService.showError(err));
  }

  resumeReplay() {
    this.yamcs.yamcsClient.editReplayProcessor(this.yamcs.instance!, this.yamcs.processor!, { state: 'running' })
      .catch(err => this.messageService.showError(err));
  }

  changeSpeed(speed: string) {
    this.yamcs.yamcsClient.editReplayProcessor(this.yamcs.instance!, this.yamcs.processor!, { speed })
      .catch(err => this.messageService.showError(err));
  }

  async leaveAndCloseReplay() {
    const instance = this.yamcs.instance!;
    const processor = this.yamcs.processor!;
    try {
      await this.yamcs.switchContext(instance);
      await this.yamcs.yamcsClient.deleteReplayProcessor(instance, processor);
    } catch (err: any) {
      this.messageService.showError(err);
    }
  }

  switchProcessorMenuOpened() {
    this.allProcessors$.next([]);
    this.yamcs.yamcsClient.getInstance(this.yamcs.instance!).then(instance => {
      this.allProcessors$.next(instance.processors || []);
    });
  }

  toggleZenMode() {
    this.appearanceService.zenMode$.next(true);
  }

  untoggleZenMode() {
    this.appearanceService.zenMode$.next(false);
  }

  switchProcessor(processor: Processor) {
    this.yamcs.switchContext(this.yamcs.instance!, processor.name)
      .catch(err => this.messageService.showError(err));
  }

  ngOnDestroy() {
    this.processorSubscription?.cancel();
    this.connectedSubscription?.unsubscribe();
  }
}
