package com.example.springboot.L4;

public class MusicPlayer {
    Music music;
    MusicPlayer(Music music){
        this.music = music;
    }
    public void playMusic(){
        System.out.println("Я сейчас играю " + music.getMusic());
    }
}
