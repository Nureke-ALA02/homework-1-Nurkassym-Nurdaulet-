package com.narxoz.rpg.character;

public class Archer extends Character {

    public Archer(String name) {
        super(name, 100, 80, 90, 70);
    }

    @Override
    public void useSpecialAbility() {
        System.out.println("Special Ability: Piercing Arrow!");
    }
}
