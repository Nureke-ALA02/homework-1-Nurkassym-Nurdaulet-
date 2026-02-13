package com.narxoz.rpg.magic;

import com.narxoz.rpg.equipment.Armor;

public class MagicArmor implements Armor {

    @Override
    public int getDefense() {
        return 10;
    }

    @Override
    public String getArmorType() {
        return "Enchanted Robes";
    }
    @Override
    public String getArmorInfo() {
        return "Armor: " + getArmorType() + " (Defense: " + getDefense() + ", Mana Boost: 25)";
    }
    @Override
    public String getSpecialProperty() {
        return "Mana Boost: 25";
    }

    public void displayInfo() {
        System.out.println(getArmorInfo());
    }
}
