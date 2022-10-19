package com.example.springboot.L11;


import org.springframework.context.support.ClassPathXmlApplicationContext;
// Spring аннотации
// аннотация @Autowired - автоматическое внедрение зависимости через конструктор/сеттер/поля
// аннотация @Qualifier - указывает какой именно бин нужно использовать для внедрения зависимости
/* <context:component-scan base-package="com.example.springboot"/>
    - эта строчка указывает полный путь, где Spring должен сканировать на предмент аннотации @component, для
    последующего создания бина этого класса
*/

public class MainL11 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextL11.xml");

        MusicPlayer musicPlayer = context.getBean(MusicPlayer.class);
        musicPlayer.playMusic();
        context.close();
    }

}
