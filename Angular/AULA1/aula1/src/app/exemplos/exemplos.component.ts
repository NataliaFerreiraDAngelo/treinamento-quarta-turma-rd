import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'rd-exemplos',
  templateUrl: './exemplos.component.html',
  styleUrls: ['./exemplos.component.css']
})
export class ExemplosComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  @Input() nome: string;


}
