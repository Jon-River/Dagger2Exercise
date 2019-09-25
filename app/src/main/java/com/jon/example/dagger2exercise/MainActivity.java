package com.jon.example.dagger2exercise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


import com.jon.example.dagger2exercise.di.component.DaggerMyApplicationComponent;

import javax.inject.Inject;

import dagger.Lazy;
import dagger.android.AndroidInjection;

public class MainActivity extends AppCompatActivity {

    @Inject
    public Student student;

    @Inject
    public Student studentB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("TAG", student.getName());
        Log.i("TAG", "Student="+student);
        Log.i("TAG", "StudentB="+studentB);
        TestClass testClass = new TestClass();
    }

    public class TestClass {
        @Inject
        public Student studentA;

        @Inject
        public Student studentB;

        public TestClass() {
            DaggerMyApplicationComponent.create().inject(this);
            Log.i("TAG", "TestClass StudentA="+studentA);
            Log.i("TAG", "TestClass StudentB="+studentB);
        }

    }
}
