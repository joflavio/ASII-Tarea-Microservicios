import { Component, OnInit } from '@angular/core';
import { Observable} from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { HttpHeaders } from '@angular/common/http';
//import { catchError} from 'rxjs/Operators';

@Component({
  selector: 'app-home-admin',
  templateUrl: './home-admin.component.html',
  styleUrls: ['./home-admin.component.css']
})

export class HomeAdminComponent implements OnInit {

  usuario:any = {};
  loading:boolean = false;
  usuarios:any = [];
  usr:any = {};
  anuncios:any = [];
  anuncio:any = {};
  productos:any = [];
  producto:any = {}; 
  crearPr:boolean = false;
  crearAn:boolean = false;
  crearUsr:boolean = false;
  compras: any = [];
  compra: any = {};
 
  constructor(private http:HttpClient) { }

  ngOnInit(): void {
    this.usuario = JSON.parse(localStorage.getItem("usuario"));
    if(!this.usuario){
      location.href = "/"
    }else{
      if(this.usuario.rol_idrol != 1){
        location.href = "/";
      }else{
        this.usr = {rol_idrol:2, telefonoEncargadoList:[], direccionEncargadoList:[]};
        this.buscarAnuncios();
        this.buscarUsuarios();
        this.buscarProductos();
        this.buscarCompras();
      }
    }
  }

  logout(){
    localStorage.removeItem("usuario");
    location.href = "/";
  }

//PRODUCTOS//

  buscarProductos(){
    this.loading = true;
    this.buscarProductosServicio().subscribe(
      (response:any)=>this.llenarProductos(response)
    );
  }

buscarProductosServicio():Observable<any>{
  return this.http.get<any>("http://localhost:3030/producto/buscar")//.pipe(
    //catchError(e=>"error"))
}

llenarProductos(productos:any){
  this.productos = productos;
  this.loading=false;
}

agregarProductos(){
  this.crearPr = !this.crearPr;
}

crearProductos(){
  let formulario:any = document.getElementById("crearPr");
  let formularioValido:boolean = formulario.reportValidity();
  if(formularioValido){
    this.loading = true;
    this.productoServicio().subscribe(
      data => this.finalizarCrearProducto(data)
    );
  }
}

finalizarCrearProducto(producto:any){
  if(producto){
    alert("Producto creado exitosamente!");
  }
  this.producto = {};
  this.crearPr = false;
  this.buscarProductos();
}

productoServicio(){
  var httpOptions = {
    headers: new HttpHeaders(
      {
        'Content-Type': 'application/json'
      })
  }
  return this.http.post<any>("http://localhost:3030/producto/guardar", this.producto, httpOptions);
  }


//ANUNCIOS//

  buscarAnuncios(){
    this.loading = true;
    this.buscarAnunciosServicio().subscribe(
      (response:any)=>this.llenarAnuncios(response)
    );
  }

buscarAnunciosServicio():Observable<any>{
  return this.http.get<any>("http://localhost:3030/anuncio/buscar")//.pipe(
    //catchError(e=>"error"))
}

llenarAnuncios(anuncios:any){
  this.anuncios = anuncios;
  this.loading=false;
}

agregarAnuncios(){
  this.crearAn = !this.crearAn;
}

crearAnuncios(){
  let formulario:any = document.getElementById("crearAn");
  let formularioValido:boolean = formulario.reportValidity();
  if(formularioValido){
    this.loading = true;
    this.anuncioServicio().subscribe(
      data => this.finalizarCrearAnuncio(data)
    );
  }
}

finalizarCrearAnuncio(anuncio:any){
  if(anuncio){
    alert("Anuncio creado exitosamente!");
  }
  this.anuncio = {};
  this.crearAn = false;
  this.buscarAnuncios();
}

anuncioServicio(){
  var httpOptions = {
    headers: new HttpHeaders(
      {
        'Content-Type': 'application/json'
      })
  }
  return this.http.post<any>("http://localhost:3030/anuncio/guardar", this.anuncio, httpOptions);
  }

//USUARIOS//

  buscarUsuarios(){
    this.loading = true;
    this.buscarUsuariosServicio().subscribe(
      (response:any)=>this.llenarUsuarios(response)
    );
  }

buscarUsuariosServicio():Observable<any>{
  return this.http.get<any>("http://localhost:3030/usuario/buscar")//.pipe(
    //catchError(e=>"error"))
}

llenarUsuarios(usuarios:any){
  this.usuarios = usuarios;
  this.loading=false;
}

agregarUsuarios(){
  this.crearUsr = !this.crearUsr;
}

crearUsuarios(){
  let formulario:any = document.getElementById("crearUsr");
  let formularioValido:boolean = formulario.reportValidity();
  if(formularioValido){
    this.loading = true;
    this.usuarioServicio().subscribe(
      data => this.finalizarCrearUsuario(data)
    );
  }
}

finalizarCrearUsuario(usr:any){
  if(usr){
    alert("Usuario encargado creado exitosamente!");
  }
  //this.usr = {};
  this.usr = {rol_idrol:2, telefonoEncargadoList:[], direccionEncargadoList:[]};
  this.crearUsr = false;
  this.buscarUsuarios();
}

usuarioServicio(){
  var httpOptions = {
    headers: new HttpHeaders(
      {
        'Content-Type': 'application/json'
      })
  }
  return this.http.post<any>("http://localhost:3030/usuario/guardar", this.usr, httpOptions);
  }

agregarTelefonoE(){
  this.usr.telefonoEncargadoList.push({});
  }

borrarTelefonoE(telefonoE:any){
  this.usr.telefonoEncargadoList.splice(this.usr.telefonoEncargadoList.indexOf(telefonoE),1);
}

agregarDireccionE(){
  this.usr.direccionEncargadoList.push({});
  }

borrarDireccionE(direccionE:any){
  this.usr.direccionEncargadoList.splice(this.usr.direccionEncargadoList.indexOf(direccionE),1);
  }

//COMPRAS

buscarCompras(){
  this.loading = true;
  this.buscarComprasServicio().subscribe(
    (response:any)=>this.llenarCompras(response)
  );
}

buscarComprasServicio():Observable<any>{
return this.http.get<any>("http://localhost:3030/compra/buscar")//.pipe(
  //catchError(e=>"error"))
}

llenarCompras(compras:any){
this.compras = compras;
this.loading=false;
}

//BOTONES DETALLES DE COMPRAS

verDetallesCAD() {
  location.href = "/detalle-compras-ad";
}

verDetallesCE() {
  location.href = "/detalle-compras-e";
}

verDetallesCC() {
  location.href = "/detalle-compras-c";
}

}
