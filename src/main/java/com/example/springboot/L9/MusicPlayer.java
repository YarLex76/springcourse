package com.example.springboot.L9;

public class MusicPlayer {
    Music music;  // объект интерфейса Music (класика или рок, мы не знаем)
    MusicPlayer(Music music){
        this.music = music;
    }
    public void playMusic(){
        System.out.println("I'm play " + music.getMusic()  );
    }
}
