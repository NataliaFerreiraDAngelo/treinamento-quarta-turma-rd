import { Component, OnInit } from '@angular/core';
import { TarefaService } from '../shared/tarefa.service';
import { ResponseTarefas } from '../shared/tarefas.model';

@Component({
  selector: 'app-listar',
  templateUrl: './listar.component.html'
})
export class ListarComponent implements OnInit {

  constructor(private tarefaService: TarefaService) { }

  responseTarefas: ResponseTarefas[];

  ngOnInit(): void {
    this.listarTodas();
  }

  listarTodas() {
    this.tarefaService.getTarefas().subscribe(
      response => {
        this.responseTarefas = response;
      }
    )
  }

  remover(tarefaId: number): void {
    if(confirm('Deseja remover a tarefa?')) {
      this.tarefaService.deleteTarefa(tarefaId).subscribe(
        response => {
          this.listarTodas();
        }
      )
    }
  }

}
