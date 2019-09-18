package com.jon.example.dagger2exercise.di.component;

import com.jon.example.dagger2exercise.MainActivity;
import com.jon.example.dagger2exercise.di.module.StudentModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component (modules = StudentModule.class)
public interface MainActivityComponent {
    void inject(MainActivity activity);
    void inject(MainActivity.TestClass testClass);
}
