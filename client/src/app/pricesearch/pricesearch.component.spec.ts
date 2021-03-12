import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PricesearchComponent } from './pricesearch.component';

describe('PricesearchComponent', () => {
  let component: PricesearchComponent;
  let fixture: ComponentFixture<PricesearchComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PricesearchComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PricesearchComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
