package com.example.springboot.L10;

import org.springframework.stereotype.Component;


@Component
public class ClassicalMusic implements Music {

    @Override
    public String getMusic() {
        return "Music: Bethoven";
    }
}
