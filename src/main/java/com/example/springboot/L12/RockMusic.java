package com.example.springboot.L12;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class RockMusic implements Music {


    @Override
    public String getMusic() {
        return "Music: Metallica";
    }
}
