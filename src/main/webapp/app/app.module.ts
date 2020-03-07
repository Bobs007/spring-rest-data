import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import './vendor';
import { SpringRestDataSharedModule } from 'app/shared/shared.module';
import { SpringRestDataCoreModule } from 'app/core/core.module';
import { SpringRestDataAppRoutingModule } from './app-routing.module';
import { SpringRestDataHomeModule } from './home/home.module';
import { SpringRestDataEntityModule } from './entities/entity.module';
// jhipster-needle-angular-add-module-import JHipster will add new module here
import { MainComponent } from './layouts/main/main.component';
import { NavbarComponent } from './layouts/navbar/navbar.component';
import { FooterComponent } from './layouts/footer/footer.component';
import { PageRibbonComponent } from './layouts/profiles/page-ribbon.component';
import { ErrorComponent } from './layouts/error/error.component';

@NgModule({
  imports: [
    BrowserModule,
    SpringRestDataSharedModule,
    SpringRestDataCoreModule,
    SpringRestDataHomeModule,
    // jhipster-needle-angular-add-module JHipster will add new module here
    SpringRestDataEntityModule,
    SpringRestDataAppRoutingModule
  ],
  declarations: [MainComponent, NavbarComponent, ErrorComponent, PageRibbonComponent, FooterComponent],
  bootstrap: [MainComponent]
})
export class SpringRestDataAppModule {}
