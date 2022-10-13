package com.example.springboot.L7;


import org.springframework.context.support.ClassPathXmlApplicationContext;
// область видимости бинов

/*
<bean id="l7_Music"
          class="com.example.springboot.L7.RockMusic">
    </bean>

    <bean id="l7_musicPlayer"
        class="com.example.springboot.L7.MusicPlayer"
        scope = "prototype">
        <property name="music" ref="l7_Music" />
        <property name="playerName"  value = "alexPlayer"/>
        <property name="volume" value  = "50"/>
        <property name="color" value="${musicPlayer.color}"/>
        <property name="musicList" value="${musicPlayer.musicList}"/>
    </bean>

 */

public class MainL7 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer musicPlayer = context.getBean("l7_musicPlayer", MusicPlayer.class );
        MusicPlayer musicPlayer2 = context.getBean("l7_musicPlayer", MusicPlayer.class );
        System.out.println(musicPlayer);
        System.out.println(musicPlayer2);
        boolean compapison = musicPlayer == musicPlayer2;
        System.out.println(compapison); // будет true
        // в данном случае объекты оказались равны так как кажды раз получали один и тот же бин/объект
        musicPlayer.setVolume(10); // данное изменение коснется всех объектов класса musicPlayer
        System.out.println(musicPlayer.getVolume()); // 10
        System.out.println(musicPlayer2.getVolume()); // тоже 10
        // выход указать в xml файле   scope = "prototype"
        // в данном случае spring каждый раз будет создавать новый объект


        context.close();
    }

}
