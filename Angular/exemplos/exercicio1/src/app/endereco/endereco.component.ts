import { Component, OnInit, Input } from '@angular/core';
import { Endereco } from './endereco.model';

@Component({
  selector: 'app-endereco',
  templateUrl: './endereco.component.html',
  styleUrls: ['./endereco.component.css']
})
export class EnderecoComponent implements OnInit {

  @Input() endereco: Endereco;

  constructor() { }

  ngOnInit(): void {
    this.iniciar();
  }

  iniciar() {
    alert("componente foi renderizado");
  }

  addEndereco() {
      if(confirm("deseja adicionar o endereço")){
          alert("endereço adicionado com sucesso");
          return;
      };

      alert("endereço não foi adicionado")
  }

}
