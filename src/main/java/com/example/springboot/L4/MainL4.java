package com.example.springboot.L4;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainL4 {
    public static void main(String[] args) {
        System.out.println("Start");

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music music = context.getBean("l4", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music); // мы не создаем объект класса ClassicalMusis
        musicPlayer.playMusic();
        context.close();
        System.out.println("Stop");


    }

}
