import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PersonalLoanApplicationComponent } from './personal-loan-application.component';

describe('PersonalLoanApplicationComponent', () => {
  let component: PersonalLoanApplicationComponent;
  let fixture: ComponentFixture<PersonalLoanApplicationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PersonalLoanApplicationComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PersonalLoanApplicationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
