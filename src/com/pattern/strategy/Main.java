package com.pattern.strategy;

/**
 *
 * */
public class Main {

    public static void main(String[] args) {

        GameCharacter gameCharacter = new GameCharacter();

        gameCharacter.attack();

        gameCharacter.setWeapon(new Knife());
        gameCharacter.attack();

        gameCharacter.setWeapon(new Bow());
        gameCharacter.attack();

        // 추가 Weapon
        gameCharacter.setWeapon(new Ax());
        gameCharacter.attack();
    }
}
