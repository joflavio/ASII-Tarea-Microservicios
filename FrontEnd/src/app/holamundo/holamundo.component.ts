import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-holamundo',
  templateUrl: './holamundo.component.html',
  styleUrls: ['./holamundo.component.css']
})
export class HolamundoComponent {

  constructor() { }

  holamundo() {
    location.href = "/holamundo";
  }

}
