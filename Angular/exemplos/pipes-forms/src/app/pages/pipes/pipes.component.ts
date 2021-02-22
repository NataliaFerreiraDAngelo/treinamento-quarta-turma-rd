import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pipes',
  templateUrl: './pipes.component.html'
})
export class PipesComponent implements OnInit {

  constructor() { }

  user = {
    name: 'Luke Skywalker', 
    isJedi: true,
    niver: new Date(1980, 6, 20),
    price: 59.90
  }

  ngOnInit(): void {
  }

}
