package com.example.springboot.L8;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RockMusic implements Music {
    public void initMethod (){
        log.info("Инициация бина");
    }

    public void destroyMethod(){
        System.out.println("destroying my bean");
    }

    @Override
    public String getMusic() {
        return "Music: Metallica";
    }
}
