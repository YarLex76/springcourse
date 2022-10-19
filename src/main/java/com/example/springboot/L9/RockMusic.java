package com.example.springboot.L9;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component("rockMusikBean") // Можно с добавление id  - @Component("rockMusik1")
public class RockMusic implements Music {

    @Override
    public String getMusic() {
        return "Music: Metallica";
    }
}
