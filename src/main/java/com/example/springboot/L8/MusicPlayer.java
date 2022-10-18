package com.example.springboot.L8;

public class MusicPlayer {
    Music music;  // объект интерфейса Music (класика или рок, мы не знаем)
    private String playerName; // название плеера - будет внедрено(присвоено) в xml файле
    private int volume; // громкость звучания - будет внедрено(присвоено) в xml файле
    private String color; //цвет плеера - будет внедрено из внешнего файла *.properties
    private int musicList; //количество треков в плеере - будет внедрено из внешнего файла *.properties

    MusicPlayer(Music music){
        this.music = music;
    }


    //добавляем пустой конструктор, т.к при создании нового бина больше не будем использовать
    // предыдущий конструктор, а будем использовать сеттре, поэтому нужен пустой конструктор
    MusicPlayer(){}

    public void setMusic(Music music) { //добавили сеттер
        this.music = music;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMusicList() {
        return musicList;
    }

    public void setMusicList(int musicList) {
        this.musicList = musicList;
    }

    public void playMusic(){
        System.out.println("I'm play " + music.getMusic() + " " + playerName + " " + volume + " " + color + " " + musicList );
    }
}
