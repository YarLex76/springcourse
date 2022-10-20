package com.example.springboot.L12;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Slf4j
@Component
@Scope("singleton")
public class ClassicalMusic implements Music {

    @PostConstruct
    public void doMyInit(){
        log.info("Бин классикалЬьюзик создался");
    }

    @PreDestroy
    public void doMyDestroy(){
        log.info("Бин классикалЬьюзик уничтожен");
    }


    @Override
    public String getMusic() {
        return "Music: Bethoven";
    }
}
