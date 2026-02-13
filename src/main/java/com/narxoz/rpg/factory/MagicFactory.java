package com.narxoz.rpg.factory;

import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.magic.MagicArmor;
import com.narxoz.rpg.magic.MagicWeapon;

public class MagicFactory implements EquipmentFactory {

    @Override
    public Weapon createWeapon() {
        return new MagicWeapon();
    }

    @Override
    public Armor createArmor() {
        return new MagicArmor();
    }
}
