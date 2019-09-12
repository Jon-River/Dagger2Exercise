package com.jon.example.dagger2exercise.di.component;

import com.jon.example.dagger2exercise.MainActivity;

import dagger.Component;

@Component
public interface MainActivityComponent {
    void inject(MainActivity activity);
}
