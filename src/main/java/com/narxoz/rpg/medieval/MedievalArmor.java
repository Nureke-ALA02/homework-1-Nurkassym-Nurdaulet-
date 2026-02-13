package com.narxoz.rpg.medieval;

import com.narxoz.rpg.equipment.Armor;

public class MedievalArmor implements Armor {
    @Override
    public String getArmorInfo() {
        System.out.println("Armor: Plate Armor (Defense: 30)");
        return null;
    }

    @Override
    public String getSpecialProperty() {
        return "";
    }

    @Override
    public int getDefense() {
        return 30;
    }

    @Override
    public String getArmorType() {
        return "";
    }
}
