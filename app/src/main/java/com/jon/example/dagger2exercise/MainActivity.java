package com.jon.example.dagger2exercise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.jon.example.dagger2exercise.di.component.DaggerMainActivityComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    public Student student;

    @Inject
    public Student studentB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        DaggerMainActivityComponent.create().inject(this);
        Log.i("TAG", student.getName());
        Log.i("TAG", "Student="+student);
        Log.i("TAG", "StudentB="+studentB);
    }
}
