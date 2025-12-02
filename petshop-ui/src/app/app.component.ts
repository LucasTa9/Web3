import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';

import { ButtonModule } from 'primeng/button';
import { TableModule } from 'primeng/table';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [
    RouterOutlet,
    ButtonModule,
    TableModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'petshop-ui';

  adocao= [
    { type: 'CORRIDA', adocao_date: '27/05/2025', distance: 8.0, duration: 42, user: 'Fernando Duarte' },
    { type: 'CORRIDA', adocao_date: '28/05/2025', distance: 8.0, duration: 43, user: 'Fernando Duarte' },
    { type: 'CAMINHADA', adocao_date: '28/05/2025', distance: 5.0, duration: 55, user: 'Juliana Silva' }
  ];

}
