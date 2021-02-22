import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-cadastro',
  templateUrl: './cadastro.component.html',
  styleUrls: ['./cadastro.component.css']
})
export class CadastroComponent implements OnInit {

  constructor() { }

  userName: string = "Jonas";

  ngOnInit(): void {
  }

  verDados() {
    console.log(this.userName);
  }

  checkForm(form) {
    console.log(form);
  }

}
