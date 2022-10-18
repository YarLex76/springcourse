package com.example.springboot.L8;


import org.springframework.context.support.ClassPathXmlApplicationContext;
// Жизненный цикл бинов (Bean Lifecycle). Init, Destroy и Factory методы


public class MainL8 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextL8.xml");
        ClassicalMusic classicalMusic = context.getBean("l8_Music", ClassicalMusic.class);
        System.out.println(classicalMusic.getMusic());

        RockMusic rockMusic = context.getBean("l8_Music1", RockMusic.class);
        System.out.println(rockMusic.getMusic());

        /*MusicPlayer musicPlayer = context.getBean("l8_musicPlayer", MusicPlayer.class );
        MusicPlayer musicPlayer2 = context.getBean("l8_musicPlayer", MusicPlayer.class );
        System.out.println(musicPlayer);
        System.out.println(musicPlayer2);
        boolean compapison = musicPlayer == musicPlayer2;
        System.out.println(compapison); // будет true
        // в данном случае объекты оказались равны так как кажды раз получали один и тот же бин/объект
        musicPlayer.setVolume(10); // данное изменение коснется всех объектов класса musicPlayer
        System.out.println(musicPlayer.getVolume()); // 10
        System.out.println(musicPlayer2.getVolume()); // тоже 10
        // выход указать в xml файле   scope = "prototype"
        // в данном случае spring каждый раз будет создавать новый объект*/


        context.close();
    }

}
