import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppLayoutComponent } from './layout/app-layout/app-layout.component';

const routes: Routes =[
  {path: '', redirectTo: '/analise', pathMatch: 'full'},
  {
    path: '',
    component: AppLayoutComponent,
    children: [
      {
        path: 'analise',
        loadChildren: () => import('./analise/analise.module').then((m) => m.AnaliseModule)
      }
    ]
  }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
