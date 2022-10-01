import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { SigninComponent } from './signin/signin.component';

import {FormsModule} from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';
import { HomeAdminComponent } from './home-admin/home-admin.component';
import { DetalleComprasADComponent } from './detalle-compras-ad/detalle-compras-ad.component';
import { DetalleComprasEComponent } from './detalle-compras-e/detalle-compras-e.component';
import { DetalleComprasCComponent } from './detalle-compras-c/detalle-compras-c.component';
import { HolamundoComponent } from './holamundo/holamundo.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    HomeComponent,
    SigninComponent,
    HomeAdminComponent,
    DetalleComprasADComponent,
    DetalleComprasEComponent,
    DetalleComprasCComponent,
    HolamundoComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
