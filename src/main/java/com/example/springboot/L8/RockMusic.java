package com.example.springboot.L8;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RockMusic implements Music {
    private RockMusic(){} // создаем приватный конструктор, тем самым не давая создать объект через new

    public static RockMusic getRockMusic(){
        log.info("Создание бина Rock через factory-method");
        return new RockMusic();
    }

    public void initMethod() {
        log.info("Создание бина Rock");
    }

    public void destroyMethod() {
        log.info("уничтожения бина Rock");
    }
    @Override
    public String getMusic() {
        return "Music: Metallica";
    }
}
