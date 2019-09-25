package com.jon.example.dagger2exercise.di.component;

import com.jon.example.dagger2exercise.MainActivity;
import com.jon.example.dagger2exercise.di.module.StudentModule;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent (modules = {StudentModule.class} )
public interface MainActivityComponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Factory
    public interface Factory extends AndroidInjector.Factory<MainActivity> {}
}

