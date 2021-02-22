import { Component, OnInit, Input } from '@angular/core';
import { Produto } from './produto.model';

@Component({
  selector: 'app-produto',
  templateUrl: './produto.component.html',
  styleUrls: ['./produto.component.css']
})
export class ProdutoComponent implements OnInit {

  constructor() { }

  @Input() produto: Produto;

  ngOnInit(): void {
    this.teste();
  }

  teste() {
    console.log("Component iniciado");
  }

  addToCart(): void {
    console.log("OPA!! Comprou!!");
  }

}
