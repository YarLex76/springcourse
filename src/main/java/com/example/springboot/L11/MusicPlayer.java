package com.example.springboot.L11;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Slf4j
@Component // автоматическое создание бина класса
public class MusicPlayer {

    Music music;  // объект интерфейса Music (класика или рок, мы не знаем)

    @Autowired // внеждение зависимости через конструктор
    MusicPlayer(@Qualifier("rockMusic") Music music){ // точное указание какой бин нужно внедрять
        this.music = music;
        log.info("Через конструктор");
    }

    public void playMusic(){
        System.out.println("I'm play " + music.getMusic()  );
    }
}
