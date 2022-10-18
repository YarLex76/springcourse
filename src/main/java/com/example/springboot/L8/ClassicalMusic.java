package com.example.springboot.L8;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter

public class ClassicalMusic implements Music {

    public void initMethod() {
        log.info("Создание бина");
    }

    public void destroyMethod() {
        log.info("уничтожения бина");
    }

    @Override
    public String getMusic() {
        return "Music: Bethoven";
    }
}
