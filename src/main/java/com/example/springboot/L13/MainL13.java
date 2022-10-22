package com.example.springboot.L13;


import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
// Spring Framework. Урок 13_ Конфигурация с помощью Java кода
/*

@Configuration - помечает класс как конфигурационный
@ComponentScan("com.example.springboot.L13") - указывает путь где искать и создавать бины
@PropertySource("classpath:musicPlayer.properties") - путь к файлу со значниями

AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class); - ссылка на конфигурационный файл

    @Bean                             - ручное создание бина без использовая аннотации @Component
    public RockMusic rockMusic(){
        return  new RockMusic();
    }




*/
@Slf4j
public class MainL13 {
    public static void main(String[] args) {

    //  ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextL12.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);


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


        Computer computer = context.getBean(Computer.class);
        System.out.println(computer);



        context.close();
    }

}
