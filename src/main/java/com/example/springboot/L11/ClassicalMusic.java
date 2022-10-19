package com.example.springboot.L11;

import org.springframework.stereotype.Component;


@Component
public class ClassicalMusic implements Music {

    @Override
    public String getMusic() {
        return "Music: Bethoven";
    }
}
