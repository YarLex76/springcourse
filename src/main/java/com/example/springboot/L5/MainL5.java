package com.example.springboot.L5;

import com.example.springboot.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainL5 {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        //Music music = context.getBean("l4", Music.class);
        //MusicPlayer musicPlayer = new MusicPlayer(music); // мы не создаем объект класса ClassicalMusis

        /*
         * предыдущие две строки  (14-15 ) больше не нужны
         * */

       MusicPlayer musicPlayer = context1.getBean("l5MusicPlayer", MusicPlayer.class);

       musicPlayer.playMusic();

       context1.close();

    }
}