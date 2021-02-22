import { Component } from '@angular/core';
import { Endereco } from './endereco/endereco.model';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  enderecos: Endereco[] = [
    {
      id: 1,
      rua: "do Sol",
      numero: 435,
      bairro: "Centro",
      cidade: "Campinas",
      ehDesativado: false
    },
    {
      id: 2,
      rua: "da Lua",
      numero: 4535,
      bairro: "Centro",
      cidade: "Campinas",
      ehDesativado: true
    },
    {
      id: 3,
      rua: "do Céu",
      numero: 4235,
      bairro: "Centro",
      cidade: "Campinas",
      ehDesativado: false
    }
  ]
}
