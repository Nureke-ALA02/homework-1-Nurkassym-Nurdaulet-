package com.narxoz.rpg.character;

public class Warrior extends Character {

    public Warrior(String name) {
        super(name, 150, 30, 120, 40);
    }

    @Override
    public void useSpecialAbility() {
        System.out.println("Special Ability: Berserk Strike!");
    }
}
