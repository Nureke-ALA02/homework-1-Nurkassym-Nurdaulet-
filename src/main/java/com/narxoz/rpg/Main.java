package com.narxoz.rpg;
import com.narxoz.rpg.character.*;
import com.narxoz.rpg.character.Character;
import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.factory.EquipmentFactory;
import com.narxoz.rpg.factory.MagicFactory;
import com.narxoz.rpg.factory.MedievalFactory;
import com.narxoz.rpg.factory.RangerFactory;
public class Main {

    public static void main(String[] args) {
        System.out.println("=== RPG Character Creation System ===\n");
        CharacterCreator warriorCreator = new WarriorCreator();
        Character warrior = warriorCreator.createCharacter("Thor");

        System.out.println("Creating Warrior...");
        warrior.getStats();
        warrior.useSpecialAbility();
        EquipmentFactory medievalFactory = new MedievalFactory();
        Weapon wWeapon = medievalFactory.createWeapon();
        Armor wArmor = medievalFactory.createArmor();

        System.out.println("\nEquipping with Medieval Set...");
        wWeapon.getWeaponInfo();
        wArmor.getArmorInfo();
        System.out.println("\n-------------------------\n");
        CharacterCreator mageCreator = new MageCreator();
        Character mage = mageCreator.createCharacter("Merlin");

        System.out.println("Creating Mage...");
        mage.getStats();
        mage.useSpecialAbility();

        EquipmentFactory magicFactory = new MagicFactory();
        Weapon mWeapon = magicFactory.createWeapon();
        Armor mArmor = magicFactory.createArmor();

        System.out.println("\nEquipping with Magic Set...");
        mWeapon.getWeaponInfo();
        mArmor.getArmorInfo();
        System.out.println("\n-------------------------\n");
        CharacterCreator archerCreator = new ArcherCreator();
        Character archer = archerCreator.createCharacter("Legolas");

        System.out.println("Creating Archer...");
        archer.getStats();
        archer.useSpecialAbility();

        EquipmentFactory rangerFactory = new RangerFactory();
        Weapon aWeapon = rangerFactory.createWeapon();
        Armor aArmor = rangerFactory.createArmor();
        System.out.println("\nEquipping with Ranger Set...");
        aWeapon.getWeaponInfo();
        aArmor.getArmorInfo();
    }
}
