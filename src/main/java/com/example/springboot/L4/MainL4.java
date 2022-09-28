package com.example.springboot.L4;

import com.example.springboot.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainL4 {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music music = context.getBean("l4", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music); // мы не создаем объект класса ClassicalMusis
        musicPlayer.playMusic();
        context.close();


    }

}
