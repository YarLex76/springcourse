package com.example.springboot;

public class TestBean {
    private String name;
    private int age;

    public  TestBean(String name){
        this.name = name;
        this.age = 20;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
