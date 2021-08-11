package com.pattern.singleton;

/**
 *
 * */
public class Main {

    public static void main(String[] args) {

        SystemSpeaker systemSpeaker1 = SystemSpeaker.getInstance();
        SystemSpeaker systemSpeaker2 = SystemSpeaker.getInstance();

        // 5, 5
        System.out.println(systemSpeaker1.getVolume());
        System.out.println(systemSpeaker2.getVolume());

        // 10, 10
        systemSpeaker1.setVolume(10);
        System.out.println(systemSpeaker1.getVolume());
        System.out.println(systemSpeaker2.getVolume());


        // 20, 20
        systemSpeaker2.setVolume(20);
        System.out.println(systemSpeaker1.getVolume());
        System.out.println(systemSpeaker2.getVolume());

    }
}
