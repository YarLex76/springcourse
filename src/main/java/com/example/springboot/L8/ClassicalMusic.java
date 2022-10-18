package com.example.springboot.L8;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ClassicalMusic implements Music {

    public void initMethod() {
        log.info("Создание бина");
    }

    public void destroyMethod() {
        System.out.println("destroying my bean");
    }

    @Override
    public String getMusic() {
        return "Music: Bethoven";
    }
}
