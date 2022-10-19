package com.example.springboot.L9;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;


@Component
public class ClassicalMusic implements Music {

    @Override
    public String getMusic() {
        return "Music: Bethoven";
    }
}
