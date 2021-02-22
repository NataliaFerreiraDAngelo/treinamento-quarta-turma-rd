import { Component } from '@angular/core';
import { Produto } from './produto/produto.model';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  produtos: Produto[] = [
    {id: 3124, nome: "Brastemp B34", temEstoque: true},
    {id: 3456, nome: "Consul C797", temEstoque: false},
    {id: 7865, nome: "Dell AC25", temEstoque: true}
  ]
  
}
