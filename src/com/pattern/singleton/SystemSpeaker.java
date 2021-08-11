package com.pattern.singleton;

public class SystemSpeaker {
//    static private SystemSpeaker instance;

    private int volume;

    private SystemSpeaker() {
        this.volume = 5;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    private static class LazyHolder {
        public static final SystemSpeaker INSTANCE = new SystemSpeaker();
    }

    public static SystemSpeaker getInstance() {
        return LazyHolder.INSTANCE;
    }

//    public static SystemSpeaker getInstance() {
//        if (instance == null) {
//            synchronized (SystemSpeaker.class) {
//                if (instance == null) {
//                    instance = new SystemSpeaker();
//                }
//            }
//        }
//        return instance;
//    }
}
