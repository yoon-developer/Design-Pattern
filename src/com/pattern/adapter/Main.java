package com.pattern.adapter;

/**
 *
 * */
public class Main {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "audio_track.mp3");
        audioPlayer.play("mp4", "audio_track.mp4");
        audioPlayer.play("vlc", "audio_track.vlc");
    }
}
