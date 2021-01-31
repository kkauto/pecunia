import { ComponentFixture, TestBed } from '@angular/core/testing';

import { VehicleLoanApplicationComponent } from './vehicle-loan-application.component';

describe('VehicleLoanApplicationComponent', () => {
  let component: VehicleLoanApplicationComponent;
  let fixture: ComponentFixture<VehicleLoanApplicationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ VehicleLoanApplicationComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(VehicleLoanApplicationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
