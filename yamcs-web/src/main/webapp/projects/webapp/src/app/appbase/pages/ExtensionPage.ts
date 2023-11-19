import { AfterViewInit, ChangeDetectionStrategy, Component, ElementRef, Input, OnChanges, ViewChild, inject } from '@angular/core';
import { ExtensionService, YamcsService } from '@yamcs/webapp-sdk';

@Component({
  templateUrl: './ExtensionPage.html',
  changeDetection: ChangeDetectionStrategy.OnPush,
})
export class ExtensionPage implements AfterViewInit, OnChanges {

  private extensionService = inject(ExtensionService);
  private yamcs = inject(YamcsService);

  @Input()
  extension: string;

  @ViewChild('customElementControlsHolder')
  customElementControlsHolder: ElementRef<HTMLDivElement>;

  @ViewChild('customElementHolder')
  customElementHolder: ElementRef<HTMLDivElement>;

  ngAfterViewInit() {
    this.loadExtension(this.extension);
  }

  ngOnChanges() {
    if (this.extension && this.customElementHolder) {
      this.loadExtension(this.extension);
    }
  }

  private loadExtension(extension: string) {
    const { nativeElement: holder } = this.customElementHolder;
    holder.innerHTML = `<${extension}></${extension}>`;

    const extensionEl = holder.childNodes.item(0);
    (extensionEl as any).extensionService = this.extensionService;

    const { nativeElement: controlsHolder } = this.customElementControlsHolder;
    controlsHolder.innerHTML = `<${extension}-controls></${extension}-controls>`;

    const extensionControlsEl = controlsHolder.childNodes.item(0);
    (extensionControlsEl as any).extensionService = this.extensionService;
    (extensionControlsEl as any).mainComponent = extensionEl;
  }
}
