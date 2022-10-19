package com.example.springboot.L11;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {

    @Override
    public String getMusic() {
        return "Music: Metallica";
    }
}
