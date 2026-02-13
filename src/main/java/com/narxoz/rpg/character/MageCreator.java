package com.narxoz.rpg.character;

public class MageCreator extends CharacterCreator {
    @Override
    public Character createCharacter(String name) {
        return new Mage(name);
    }
}
