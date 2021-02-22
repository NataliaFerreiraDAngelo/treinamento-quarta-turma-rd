import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-produto',
  templateUrl: './produto.component.html'
})
export class ProdutoComponent implements OnInit {

  constructor() { }

  livro = {
    titulo: "Java: Como Programar",
    rating: 4.23456,
    numeroPaginas: 968,
    preco: 312.99,
    dataLancamento: new Date(2016, 4, 24),
    url: 'https://www.americanas.com.br/produto/134495969'

  }

  ngOnInit(): void {
  }

}
