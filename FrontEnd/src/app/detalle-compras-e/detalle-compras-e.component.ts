import { Component, OnInit } from '@angular/core';
import { Observable} from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { HttpHeaders } from '@angular/common/http';
//import { catchError} from 'rxjs/Operators';

@Component({
  selector: 'app-detalle-compras-e',
  templateUrl: './detalle-compras-e.component.html',
  styleUrls: ['./detalle-compras-e.component.css']
})
export class DetalleComprasEComponent implements OnInit {

  usuario:any = {};
  loading:boolean = false;
  usuarios:any = [];
  compras: any = [];
  compra: any = {};
  clientes:any = [];
  cliente:any = {};

  constructor(private http:HttpClient) { }

  ngOnInit(): void {
    /*this.usuario = JSON.parse(localStorage.getItem("usuario"));
    if(!this.usuario){
      location.href = "/"
    }else{
      if(this.usuario.rol_idrol != 1){
        location.href = "/";
      }else{
        this.buscarCompras();
        this.buscarClientes();
      }
    }*/
  }

  buscarCompras(){
    this.loading = true;
    this.buscarComprasServicio().subscribe(
      (response:any)=>this.llenarCompras(response)
    );
  }
  
  buscarComprasServicio():Observable<any>{
  return this.http.get<any>("http://localhost:3030/compra/buscar")//.pipe(
   // catchError(e=>"error"))
  }
  
  llenarCompras(compras:any){
  this.compras = compras;
  this.loading=false;
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

}
