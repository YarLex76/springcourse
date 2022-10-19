package com.example.springboot.L9;


import org.springframework.context.support.ClassPathXmlApplicationContext;
// Spring фннотации
/* <context:component-scan base-package="com.example.springboot"/>
    - эта строчка указывает полный путь, где Spring должен сканировать на предмент аннотации @component, для
    последующего создания бина этого класса
*/

public class MainL9 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextL9.xml");

        ClassicalMusic classicalMusic = context.getBean(ClassicalMusic.class); // без указания id бина
        System.out.println(classicalMusic.getMusic());

        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class); // без указания id бина, тогда id - название класса с мал буквы
        System.out.println(classicalMusic1.getMusic());

        RockMusic rockMusic = context.getBean("rockMusikBean", RockMusic.class); // с указанием id бина
        System.out.println(rockMusic.getMusic());

        MusicPlayer musicPlayer = new MusicPlayer(rockMusic);
        musicPlayer.playMusic();




        context.close();
    }

}
