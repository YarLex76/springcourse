package com.example.springboot.L10;


import org.springframework.context.support.ClassPathXmlApplicationContext;
// Spring аннотации
// аннотация @Autowired - автоматическое внедрение зависимости через конструктор/сеттер/поля
/* <context:component-scan base-package="com.example.springboot"/>
    - эта строчка указывает полный путь, где Spring должен сканировать на предмент аннотации @component, для
    последующего создания бина этого класса
*/

public class MainL10 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextL10.xml");

        MusicPlayer musicPlayer = context.getBean(MusicPlayer.class); // без указания id бина
        musicPlayer.playMusic();
        context.close();
    }

}
