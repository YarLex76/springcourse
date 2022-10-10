package com.example.springboot.L4;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainL4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music music = context.getBean("l4", Music.class); // создаем объект интерфейса Music с помощью xml файла
                                                                // т.е какой именно объект будет класик или рок прописано в xml файле

        MusicPlayer musicPlayer = new MusicPlayer(music); // мы не создаем объект класса ClassicalMusis
      // MusicPlayer musicPlayer = new MusicPlayer(new ClassicalMusic()); // без Spring объект создавали так

        Music music1 = context.getBean("l4_1", Music.class); // здесь будет играть рок музыка
        MusicPlayer musicPlayer1 = new MusicPlayer(music1);

        musicPlayer.playMusic();
        musicPlayer1.playMusic();

        context.close();
    }

}
