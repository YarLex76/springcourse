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




        context.close();
    }

}
