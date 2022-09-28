package com.example.springboot.L5;

public class MusicPlayer {
    Music music;
    MusicPlayer(Music music){
        this.music = music;
    }
    public void playMusic(){
        System.out.println(music.getMusic());
    }
}
