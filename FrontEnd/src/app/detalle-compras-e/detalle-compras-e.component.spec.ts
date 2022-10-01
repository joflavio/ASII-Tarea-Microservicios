import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DetalleComprasEComponent } from './detalle-compras-e.component';

describe('DetalleComprasEComponent', () => {
  let component: DetalleComprasEComponent;
  let fixture: ComponentFixture<DetalleComprasEComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DetalleComprasEComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DetalleComprasEComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
