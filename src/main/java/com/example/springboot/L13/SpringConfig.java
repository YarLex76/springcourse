package com.example.springboot.L13;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.example.springboot.L13")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public RockMusic rockMusic(){
        return  new RockMusic();
    }

    @Bean
    public Computer computer(){
        return new Computer(new MusicPlayer(rockMusic()));
    }

}
