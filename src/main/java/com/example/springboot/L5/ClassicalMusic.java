package com.example.springboot.L5;

public class ClassicalMusic implements Music {
    String x = "1";
    @Override

    public String getMusic() {
        return x;
    }
}
