import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Tarefa } from '../shared/tarefas.model';
import { TarefaService } from '../shared/tarefa.service';

@Component({
  selector: 'app-cadastrar',
  templateUrl: './cadastrar.component.html'
})
export class CadastrarComponent implements OnInit {

  constructor(
    private tarefaService: TarefaService,
    private router: Router 
    ) { }

  request: Tarefa = {
    id: null,
    name: '',
    completed: false
  }

  ngOnInit(): void {
  }

  registrar() {
    this.tarefaService.createTarefa(this.request).subscribe(
      response => {
        alert('tarefa cadastrada com sucesso');
        this.router.navigate(['/tarefas/listar']);
      },
      error => {
        alert('algo inesperado aconteceu');
      }
    )
  }

}
