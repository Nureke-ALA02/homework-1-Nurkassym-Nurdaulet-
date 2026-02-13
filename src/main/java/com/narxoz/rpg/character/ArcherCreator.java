package com.narxoz.rpg.character;

public class ArcherCreator extends CharacterCreator {
    @Override
    public Character createCharacter(String name) {
        return new Archer(name);
    }
}
