package com.jon.example.dagger2exercise.di.module;

import com.jon.example.dagger2exercise.Student;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class StudentModule {
    @Provides
    public Student provideStudent() {
        return new Student();
    }
}
