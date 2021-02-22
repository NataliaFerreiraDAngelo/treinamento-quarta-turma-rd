import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { HomeComponent } from './pages/home/home.component';
import { PipesComponent } from './pages/pipes/pipes.component';
import { ProdutoComponent } from './pages/produto/produto.component';


const routes: Routes = [
  {
    path: '',
    component: HomeComponent
  },
  {
    path: 'pipes',
    component: PipesComponent
  },
  {
    path: 'produto',
    component: ProdutoComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
