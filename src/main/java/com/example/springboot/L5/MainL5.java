package com.example.springboot.L5;


import org.springframework.context.support.ClassPathXmlApplicationContext;
// создание зависимости в конструкторе и описании зависимости в xml - файле
/*
    в один бин перередаем другой биня
    в бин MusicPlayer передаем бин (в конструктор) бин Mucic

    <bean id="l5_Music"
          class="com.example.springboot.L5.RockMusic">
    </bean>

    <bean id="l5_musicPlayer"
          class="com.example.springboot.L5.MusicPlayer">
          <constructor-arg ref="l5_Music" />
    </bean>
 */

public class MainL5 {
    public static void main(String[] args) {
        // создаем объект ClassPathXmlApplicationContext , в конструктор передаем файл xml
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


        //Music music = context.getBean("l4", Music.class);  - было
        //MusicPlayer musicPlayer = new MusicPlayer(music); - было

        MusicPlayer musicPlayer = context.getBean("l5_musicPlayer", MusicPlayer.class );



        musicPlayer.playMusic();


        context.close();
    }

}
