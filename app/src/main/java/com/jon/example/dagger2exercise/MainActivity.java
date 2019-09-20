package com.jon.example.dagger2exercise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

//import com.jon.example.dagger2exercise.di.component.DaggerMainActivityComponent;
//import com.jon.example.dagger2exercise.di.component.DaggerStudentComponent;

//import com.jon.example.dagger2exercise.di.component.DaggerMainActivityComponent;
import com.jon.example.dagger2exercise.di.component.DaggerStudentComponent;
import com.jon.example.dagger2exercise.di.component.MainActivityComponent;
import com.jon.example.dagger2exercise.di.component.StudentComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    public Student student;

    @Inject
    public Student studentB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerStudentComponent.create().plus().inject(this);
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
            DaggerStudentComponent.create().plus().inject(this);
            Log.i("TAG", "TestClass StudentA="+studentA);
            Log.i("TAG", "TestClass StudentB="+studentB);
        }

    }
}
