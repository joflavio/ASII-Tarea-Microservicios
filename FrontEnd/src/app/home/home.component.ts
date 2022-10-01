import { Component, OnInit } from '@angular/core';
import { Observable} from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { HttpHeaders } from '@angular/common/http';
//import { catchError} from 'rxjs/Operators';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  usuario:any = {};
  loading:boolean = false;
  clientes:any = [];
  cliente:any = {};
  crear:boolean = false;
  compras:any = [];
  compra:any = {};

  constructor(private http:HttpClient) { }

  ngOnInit(): void {
    this.usuario = JSON.parse(localStorage.getItem("usuario"));
    if(!this.usuario){
      location.href = "/"
    }else{
      this.cliente = {idcorreo:this.usuario.correo,direccionClienteList:[],telefonoClienteList:[]};
      this.buscarClientes();
      this.buscarCompras();
    }
    console.log(this.usuario)
  }

  logout(){
    localStorage.removeItem("usuario");
    location.href = "/";
  }

  buscarClientes(){
    this.loading = true;
    this.buscarClientesServicio().subscribe(
      (response:any)=>this.llenarClientes(response)
    );
  }

buscarClientesServicio():Observable<any>{
  return this.http.get<any>("http://localhost:3030/cliente/buscar/")//.pipe(
   // catchError(e=>"error"))
}

llenarClientes(clientes:any){
  this.clientes = clientes;
  this.loading=false;
}

agregar(){
  this.crear = !this.crear;
}

crearCliente(){
  let formulario:any = document.getElementById("crear");
  let formularioValido:boolean = formulario.reportValidity();
  if(formularioValido){
    this.loading = true;
    this.clienteServicio().subscribe(
      data => this.finalizarCrearCliente(data)
    );
  }
}

finalizarCrearCliente(cliente:any){
  if(cliente){
    alert("Cliente creado exitosamente!");
  }
  this.cliente = {idcorreo:this.usuario.correo,direccionClienteList:[],telefonoClienteList:[]};
  this.crear = false;
  this.buscarClientes();
}

clienteServicio(){
  var httpOptions = {
    headers: new HttpHeaders(
      {
        'Content-Type': 'application/json'
      })
  }
  return this.http.post<any>("http://localhost:3030/cliente/guardar", this.cliente, httpOptions);
  }

agregarTelefono(){
  this.cliente.telefonoClienteList.push({});
  }

borrarTelefono(telefono:any){
  this.cliente.telefonoClienteList.splice(this.cliente.telefonoClienteList.indexOf(telefono),1);
}

agregarDireccion(){
  this.cliente.direccionClienteList.push({});
  }

borrarDireccion(direccion:any){
  this.cliente.direccionClienteList.splice(this.cliente.direccionClienteList.indexOf(direccion),1);
  }

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

}

