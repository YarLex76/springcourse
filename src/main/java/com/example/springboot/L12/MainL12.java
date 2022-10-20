package com.example.springboot.L12;


import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
// Spring Framework. Урок 12_ Аннотации @Scope, @Value, @PostConstruct, @PreDestroy
// <context:property-placeholder location= "classpath:musicPlayer.properties "/> - фаил, источник данных для бина

//    @Value("${musicPlayer.name}") - внедряет значение из файла прописанного в xml
//    private String name;

//    @Scope("singleton") - указывает тип создаваемого бина - каждый раз тот-же бин
//    @Scope("prototype") - указывает тип создаваемого бина - каждый раз новый бин

//  @PostConstruct - указывает Init metod в классе
//  public void doMyInit(){ log.info("Бин классикалЬьюзик создался"); }

//  @PreDestroy - указывает destroy metod в классе
//  public void doMyDestroy(){ log.info ("Бин классикалЬьюзик уничтожен"); }  с ("prototype") не нужен и работать не будет

@Slf4j
public class MainL12 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextL12.xml");

        MusicPlayer musicPlayer = context.getBean(MusicPlayer.class);
        musicPlayer.playMusic();
        log.info(musicPlayer.getName());
        log.info(Integer.toString(musicPlayer.getValue())); // log не понимает int

        ClassicalMusic classicalMusic = context.getBean(ClassicalMusic.class); // получили бин
        ClassicalMusic classicalMusic1 = context.getBean(ClassicalMusic.class); // получили еще бин
        System.out.println(classicalMusic1.equals(classicalMusic)); // сравниваем бины - равны true

        RockMusic rockMusic = context.getBean(RockMusic.class); // получили бин
        RockMusic rockMusic1 = context.getBean(RockMusic.class); // получили еще бин
        System.out.println(rockMusic.equals(rockMusic1)); // сравниваем бины - не равны false



        context.close();
    }

}
