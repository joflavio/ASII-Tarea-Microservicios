import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DetalleComprasCComponent } from './detalle-compras-c.component';

describe('DetalleComprasCComponent', () => {
  let component: DetalleComprasCComponent;
  let fixture: ComponentFixture<DetalleComprasCComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DetalleComprasCComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DetalleComprasCComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
