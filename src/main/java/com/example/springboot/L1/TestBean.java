package com.example.springboot.L1;

public class TestBean {
    private String name;
    private String country;
    private int age;

    public TestBean(String name, int age, String country) {
        System.out.println("constructor 3");
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public TestBean(String name, int age) {
        System.out.println("constructor 2");
        this.name = name;
        this.age = age;
        this.country = "USA";
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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
