package com.narxoz.rpg.medieval;

import com.narxoz.rpg.equipment.Weapon;
public class MedievalWeapon implements Weapon {
    @Override
    public String getWeaponInfo() {
        System.out.println("Weapon: Iron Sword (Damage: 25)");
        return null;
    }
    @Override
    public void displayInfo() {

    }
    @Override
    public int getDamage() {
        return 25;
    }
}
