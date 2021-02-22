import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { DashboardComponent } from './pages/dashboard/dashboard.component';
import { TypographyComponent } from './pages/typography/typography.component';

const routes: Routes = [
    {
        path: '',
        component: DashboardComponent 
    },
    {
      path: 'typography',
      component: TypographyComponent 
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }