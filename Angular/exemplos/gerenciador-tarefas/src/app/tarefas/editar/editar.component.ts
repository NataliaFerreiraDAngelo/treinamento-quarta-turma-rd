import { Component, OnInit } from '@angular/core';
import { TarefaService } from '../shared/tarefa.service';
import { ActivatedRoute, Router } from '@angular/router';
import { Tarefa } from '../shared/tarefas.model'

@Component({
  selector: 'app-editar',
  templateUrl: './editar.component.html'
})
export class EditarComponent implements OnInit {

  constructor(
    private tarefaService: TarefaService,
    private route: ActivatedRoute,
    private router: Router
  ) { }

  id: string;
  request: any;

  ngOnInit(): void {
    this.id = this.route.snapshot.paramMap.get('id');
    this.tarefaService.getTarefa(this.id).subscribe(
      response => {
        this.request = response;
      }
    )
  }

  atualizar() {
    this.tarefaService.updateTarefa(this.id, this.request).subscribe(
      response => {
        alert('tarefa atualizada com sucesso');
        this.router.navigate(['/tarefas/listar']);
      },
      err => alert('algo inesperado aconteceu')
    )
  }

}
