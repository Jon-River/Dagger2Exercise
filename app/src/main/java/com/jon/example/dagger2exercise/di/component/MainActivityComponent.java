package com.jon.example.dagger2exercise.di.component;

import com.jon.example.dagger2exercise.MainActivity;

import dagger.Subcomponent;

@Subcomponent
public interface MainActivityComponent {
    void inject(MainActivity activity);
    void inject(MainActivity.TestClass testClass);
}
