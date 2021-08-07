package com.pattern.adapter;

import javax.print.attribute.standard.Media;

public class AudioPlayer implements MediaPlayer {

    @Override
    public void play(String audioType, String fileName) {

        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file. Name: " + fileName);
        }
        // 'vlc' 나 'mp4' 포맷은 MediaAdapter 로 처리한다.
        else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
            MediaPlayer mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }
    }
}
