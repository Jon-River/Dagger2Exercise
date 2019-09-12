package com.jon.example.dagger2exercise;

import javax.inject.Inject;

public class Student {
    private String name = "None";

    @Inject
    public Student() {
        name = "Default";
    }

    public void setName(String str) {
        name = str;
    }

    public String getName() {
        return name;
    }

}
