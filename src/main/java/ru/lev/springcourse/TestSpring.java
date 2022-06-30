package ru.lev.springcourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.nio.channels.ClosedSelectorException;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        /*ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong() );
*/
      /* MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();*/
       /* Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);*/
        /*Music music = context.getBean("rockMusic", Music.class);

        MusicPlayer musicPlayer = new MusicPlayer(music);

        musicPlayer.playMusic();

        Music music2 = context.getBean("classicalMusic", Music.class);

        MusicPlayer ClassicalMusicPlayer = new MusicPlayer(music2);

        ClassicalMusicPlayer.playMusic();*/
       /* MusicPlayer firtsMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        boolean comparation = firtsMusicPlayer == secondMusicPlayer;

        System.out.println(comparation);

        System.out.println(firtsMusicPlayer);
        System.out.println(secondMusicPlayer);

        firtsMusicPlayer.setVolume(10);

        System.out.println(firtsMusicPlayer.getVolume());
        System.out.println(secondMusicPlayer.getVolume());

        //System.out.println(musicPlayer.getName());
       // System.out.println(musicPlayer.getVolume());*/
        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
        System.out.println(musicPlayer.playMusic());


        context.close();
    }
}