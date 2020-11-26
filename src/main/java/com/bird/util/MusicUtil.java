package com.bird.util;

import javax.sound.sampled.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

//import sun.audio.AudioPlayer;
//import sun.audio.AudioStream;

/**
 * 音乐工具类
 *
 * @author Kingyu
 * wav音频：JDK提供的类可直接解码 mp3音频：JDK没有提供支持，需要使用第三方的工具包
 * @update Sugar-Coder
 * 使用javax自带的sound包提供wav文件的读取播放工作
 */
public class MusicUtil {

//    private static AudioStream fly;
//    private static AudioStream crash;
//    private static AudioStream score;
    private static AudioInputStream fly;
    private static AudioInputStream crash;
    private static AudioInputStream score;

    // wav播放
    public static void playFly() {
        try {
            // create an AudioStream from the InputStream
//            InputStream flyIn = new FileInputStream("resources/wav/fly.wav");
//            fly = new AudioStream(flyIn);
            // Use javax.sound
            File musicFile = new File("resources/wav/fly.wav");
            fly = AudioSystem.getAudioInputStream(musicFile);
            // Get a sound clip resource.
            Clip clip = AudioSystem.getClip();
            // Open audio clip and load samples from the audio input stream.
            clip.open(fly);
            // Create New thread to play music
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    clip.start();
                }
            });
            thread.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
//        AudioPlayer.player.start(fly);
    }

    public static void playCrash() {
        try {
            // create an AudioStream from the InputStream
//            InputStream crashIn = new FileInputStream("resources/wav/crash.wav");
//            crash = new AudioStream(crashIn);
            // Use javax.sound
            File musicFile = new File("resources/wav/fly.wav");
            crash = AudioSystem.getAudioInputStream(musicFile);
            // Get a sound clip resource.
            Clip clip = AudioSystem.getClip();
            // Open audio clip and load samples from the audio input stream.
            clip.open(crash);
//            clip.start();
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    clip.start();
                }
            });
            thread.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
//        AudioPlayer.player.start(crash);
    }

    public static void playScore() {
        try {
            // create an AudioStream from the InputStream
//            InputStream scoreIn = new FileInputStream("resources/wav/score.wav");
//            score = new AudioStream(scoreIn);
            // Use javax.sound
            File musicFile = new File("resources/wav/fly.wav");
            score = AudioSystem.getAudioInputStream(musicFile);
            // Get a sound clip resource.
            Clip clip = AudioSystem.getClip();
            // Open audio clip and load samples from the audio input stream.
            clip.open(score);
//            clip.start();
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    clip.start();
                }
            });
            thread.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
//        AudioPlayer.player.start(score);
    }
}
