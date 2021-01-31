import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HomeLoanApplicationComponent } from './home-loan-application.component';

describe('HomeLoanApplicationComponent', () => {
  let component: HomeLoanApplicationComponent;
  let fixture: ComponentFixture<HomeLoanApplicationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ HomeLoanApplicationComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(HomeLoanApplicationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
