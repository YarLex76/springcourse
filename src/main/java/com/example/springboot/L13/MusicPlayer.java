package com.example.springboot.L13;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Slf4j
@Component // автоматическое создание бина класса
public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int Value;

    public String getName() {
        return name;
    }

    public int getValue() {
        return Value;
    }

    public Music music;  // объект интерфейса Music (класика или рок, мы не знаем)

    @Autowired // внеждение зависимости через конструктор
    MusicPlayer(@Qualifier("rockMusic") Music music){ // точное указание какой бин нужно внедрять
        this.music = music;
    }

    public void playMusic(){
        System.out.println("I'm play " + music.getMusic()  );
    }
    public String playMusic1(){ return "I'm play " ; }
}
