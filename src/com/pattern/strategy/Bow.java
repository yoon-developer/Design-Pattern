package com.pattern.strategy;

public class Bow implements Weapon{

    @Override
    public void attack() {
        System.out.println("Bow attack");
    }
}
