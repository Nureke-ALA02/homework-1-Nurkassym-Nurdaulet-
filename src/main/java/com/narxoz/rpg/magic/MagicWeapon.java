package com.narxoz.rpg.magic;
import
import com.narxoz.rpg.equipment.Weapon;

public class MagicWeapon implements Weapon {

    @Override
    public int getDamage() {
        return 15;
    }
    @Override
    public String getWeaponInfo() {
        return "Weapon: Wizard Staff (Damage: 15, Mana Boost: 20)";
    }
    @Override
    public void displayInfo() {
        System.out.println(getWeaponInfo());
    }
}
