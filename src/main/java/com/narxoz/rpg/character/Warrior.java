package com.narxoz.rpg.character;



public class Warrior implements Character {

    private String name;
    private int health;
    private int mana;
    private int strength;
    private int intelligence;

    private Weapon weapon;
    private Armor armor;

    public Warrior(String name) {
        this.name = name;
        this.health = 150;
        this.mana = 30;
        this.strength = 80;
        this.intelligence = 20;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void displayStats() {
        System.out.println("=== " + name + " (Warrior) ===");
        System.out.println("Health: " + health);
        System.out.println("Mana: " + mana);
        System.out.println("Strength: " + strength);
        System.out.println("Intelligence: " + intelligence);
    }

    @Override
    public void useSpecialAbility() {
        System.out.println(name + " uses BERSERKER RAGE! Strength increased!");
    }

    @Override
    public void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public void equipArmor(Armor armor) {
        this.armor = armor;
    }

    @Override
    public void displayEquipment() {
        System.out.println("=== Equipment ===");

        if (weapon != null) {
            System.out.println("Weapon: " + weapon.getWeaponInfo());
        } else {
            System.out.println("Weapon: None");
        }

        if (armor != null) {
            System.out.println("Armor: " + armor.getArmorInfo());
        } else {
            System.out.println("Armor: None");
        }
    }
}
