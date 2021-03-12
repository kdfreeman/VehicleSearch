import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ModelsearchComponent } from './modelsearch.component';

describe('ModelsearchComponent', () => {
  let component: ModelsearchComponent;
  let fixture: ComponentFixture<ModelsearchComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ModelsearchComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ModelsearchComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
