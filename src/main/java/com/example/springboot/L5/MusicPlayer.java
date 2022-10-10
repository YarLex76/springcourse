package com.example.springboot.L5;

public class MusicPlayer {
    Music music;

    //IoC Инверсия управления - избавляемся от зависимости создавать объект music. Сооздаем его в кострукторе
    MusicPlayer(Music music){
        this.music = music;
    }


    public void playMusic(){
        System.out.println("I'm play " + music.getMusic() + " L5");
    }
}
