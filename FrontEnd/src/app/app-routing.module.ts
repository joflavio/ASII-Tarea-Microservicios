import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { HomeAdminComponent } from './home-admin/home-admin.component';
import { LoginComponent } from './login/login.component';
import { SigninComponent } from './signin/signin.component';
import { DetalleComprasADComponent} from './detalle-compras-ad/detalle-compras-ad.component';
import { DetalleComprasEComponent} from './detalle-compras-e/detalle-compras-e.component';
import { DetalleComprasCComponent} from './detalle-compras-c/detalle-compras-c.component';
import { HolamundoComponent } from './holamundo/holamundo.component';

const routes: Routes = [
  {path:'',component:LoginComponent},
  {path:'home',component:HomeComponent},
  {path:'home-admin',component:HomeAdminComponent},
  {path:'signin',component:SigninComponent},
  {path:'detalle-compras-ad',component:DetalleComprasADComponent},
  {path:'detalle-compras-e',component:DetalleComprasEComponent},
  {path:'detalle-compras-c',component:DetalleComprasCComponent},
  {path:'holamundo',component:HolamundoComponent}
];
@NgModule({
  imports: [RouterModule.forRoot(routes, { relativeLinkResolution: 'legacy' })],
  exports: [RouterModule]
})
export class AppRoutingModule { }
