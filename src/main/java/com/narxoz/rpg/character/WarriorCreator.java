package com.narxoz.rpg.character;

public class WarriorCreator extends CharacterCreator {
    @Override
    public Character createCharacter(String name) {
        return new Warrior(name);
    }
}
