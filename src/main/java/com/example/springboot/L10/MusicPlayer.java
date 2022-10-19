package com.example.springboot.L10;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component // автоматическое создание бина класса
public class MusicPlayer {
    @Autowired // внеждение зависимости через поле
    Music music;  // объект интерфейса Music (класика или рок, мы не знаем)

    @Autowired // внеждение зависимости через конструктор
    MusicPlayer(Music music){
        this.music = music;
        log.info("Через конструктор");
    }

    @Autowired // внеждение зависимости через сеттер, сеттер не обязательно называть setClass
    public void setMusic(Music music) {
        this.music = music;
        log.info("Через сеттер");
    }

    @Autowired // внеждение зависимости через сеттер, пример названия сеттера
    public void noName(Music music) {
        this.music = music;
        log.info("Через \"странный\" сеттер");
    }

    public void playMusic(){
        System.out.println("I'm play " + music.getMusic()  );
    }
}
