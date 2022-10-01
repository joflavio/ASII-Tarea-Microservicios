import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DetalleComprasADComponent } from './detalle-compras-ad.component';

describe('DetalleComprasADComponent', () => {
  let component: DetalleComprasADComponent;
  let fixture: ComponentFixture<DetalleComprasADComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DetalleComprasADComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DetalleComprasADComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
