import { ChangeDetectionStrategy, Component } from '@angular/core';
import { Title } from '@angular/platform-browser';
import { ActivatedRoute } from '@angular/router';
import { RoleInfo, YamcsService } from '@yamcs/webapp-sdk';
import { BehaviorSubject } from 'rxjs';

@Component({
  templateUrl: './RolePage.html',
  changeDetection: ChangeDetectionStrategy.OnPush,
})
export class RolePage {

  role$ = new BehaviorSubject<RoleInfo | null>(null);

  constructor(
    route: ActivatedRoute,
    private yamcs: YamcsService,
    private title: Title,
  ) {
    route.paramMap.subscribe(params => {
      const name = params.get('name')!;
      this.changeRole(name);
    });
  }

  private changeRole(name: string) {
    this.yamcs.yamcsClient.getRole(name).then(role => {
      this.role$.next(role);
      this.title.setTitle(role.name);
    });
  }
}
