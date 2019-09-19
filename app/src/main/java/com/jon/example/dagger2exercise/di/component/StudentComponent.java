package com.jon.example.dagger2exercise.di.component;

import com.jon.example.dagger2exercise.Student;
import com.jon.example.dagger2exercise.di.module.StudentModule;

import dagger.Component;

@Component (modules= StudentModule.class)
public interface StudentComponent {
    Student getStudent();
}
