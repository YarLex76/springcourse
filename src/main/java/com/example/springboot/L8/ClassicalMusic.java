package com.example.springboot.L8;

public class ClassicalMusic implements Music {
    public void initMethod (){
        System.out.println("creating my bean");
    }

    public void destroyMethod(){
        System.out.println("destroying my bean");
    }

    @Override
    public String getMusic() {
        return "Music: Bethoven";
    }
}
