package com.narxoz.rpg.ranger;

import com.narxoz.rpg.equipment.Armor;


public class RangerArmor implements Armor {

    @Override
    public int getDefense() {
        return 20;
    }

    @Override
    public String getArmorType() {
        return "Leather Armor";
    }

    @Override
    public String getArmorInfo() {
        return "Armor: " + getArmorType() + " (Defense: " + getDefense() + ", Agility Bonus)";
    }

    @Override
    public String getSpecialProperty() {
        return "Agility Bonus";
    }

    public void displayInfo() {
        System.out.println(getArmorInfo());
    }
}

