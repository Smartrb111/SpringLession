package ru.lev.springcourse;

import java.util.List;
import java.util.Random;
public class MusicPlayer {
    List<Music> musicList;

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }


    public String playMusic() {
        Random random = new Random();
        return musicList.get(random.nextInt(musicList.size())).getSong();
    }

}

