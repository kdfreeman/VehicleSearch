import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FeaturesearchComponent } from './featuresearch.component';

describe('FeaturesearchComponent', () => {
  let component: FeaturesearchComponent;
  let fixture: ComponentFixture<FeaturesearchComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FeaturesearchComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FeaturesearchComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
