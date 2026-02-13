package com.narxoz.rpg.ranger;

import com.narxoz.rpg.equipment.Weapon;
public class RangerWeapon implements Weapon {
    @Override
    public int getDamage() {
        return 30;
    }

    @Override
    public String getWeaponInfo() {
        return "Weapon: Longbow (Damage: 30, Range: Long)";
    }

    @Override
    public void displayInfo() {
        System.out.println(getWeaponInfo());
    }
}
