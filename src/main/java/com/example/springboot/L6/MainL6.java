package com.example.springboot.L6;


import org.springframework.context.support.ClassPathXmlApplicationContext;
// создание зависимости в сеттере и описании зависимости в xml - файле
// внедрение зависимостей из внешнего файла

/*
    <bean id="l6_Music"
          class="com.example.springboot.L6.RockMusic">
    </bean>

    <bean id="l6_musicPlayer"
          class="com.example.springboot.L6.MusicPlayer">
        <property name="music" ref="l6_Music" />
    </bean>
 */

public class MainL6 {
    public static void main(String[] args) {
        // создаем объект ClassPathXmlApplicationContext , в конструктор передаем файл xml
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer musicPlayer = context.getBean("l6_musicPlayer", MusicPlayer.class );
        /*
        Что в данном случае делает Spring
        1. Создается бин Music

            <bean id="l6_Music"
            class="com.example.springboot.L6.RockMusic">
            </bean>

                Music music = new Music();

        2. Далее создается объект/бин MusicPlayer с пустым конструктором

                MusicPlayer musicPlayer = new MusicPlayer();

        3. На бине musicPlayer вызывается метод setMusic, в который  передается бин music

                musicPlayer.setMusic(music);

        */
        musicPlayer.playMusic();
        context.close();
    }

}
