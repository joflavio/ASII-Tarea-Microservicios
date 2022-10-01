import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { HttpHeaders } from '@angular/common/http';

@Component({
  selector: 'app-signin',
  templateUrl: './signin.component.html',
  styleUrls: ['./signin.component.css']
})
export class SigninComponent implements OnInit {

  constructor(private http: HttpClient) { }

  usuario:any = {rol_idrol:2, telefonoEncargadoList:[], direccionEncargadoList:[]};
  loading:boolean = false;
  

  ngOnInit(): void {
  }

  crear(){
    let formulario:any = document.getElementById("crear");
    let formularioValido:boolean = formulario.reportValidity();
    if(formularioValido){
      this.loading = true;
      this.createService().subscribe(
        data => this.confirmar(data)
      )
    } 
  }

  confirmar(resultado:any){
    this.loading = false;
    if(resultado){
      alert("Usuario creado exitosamente.")
      location.href = "/";
      this.usuario = {rol_idrol:2, telefonoEncargadoList:[], direccionEncargadoList:[]};
    }else{
      alert("Error al crear usuario.")
    }
  }

  createService(){
    var httpOptions = {
      headers: new HttpHeaders(
        {
          'Content-Type': 'application/json'
        }
      )
    }
    return this.http.post<any>("http://localhost:3030/usuario/guardar", this.usuario, httpOptions);
  }

  regresar(){
    location.href = "/";
  }

  agregarTelefono(){
    this.usuario.telefonoEncargadoList.push({});
    }
  
  borrarTelefono(telefono:any){
    this.usuario.telefonoEncargadoList.splice(this.usuario.telefonoEncargadoList.indexOf(telefono),1);
  }
  
  agregarDireccion(){
    this.usuario.direccionEncargadoList.push({});
    }
  
  borrarDireccion(direccion:any){
    this.usuario.direccionEncargadoList.splice(this.usuario.direccionEncargadoList.indexOf(direccion),1);
    }
  

}
