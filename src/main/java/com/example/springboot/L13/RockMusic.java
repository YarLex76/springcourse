package com.example.springboot.L13;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// В классе  RockMusic бины будем создавать вручную
public class RockMusic implements Music {


    @Override
    public String getMusic() {
        return "Music: Metallica";
    }
}
