package com.narxoz.rpg.factory;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.ranger.RangerArmor;
import com.narxoz.rpg.ranger.RangerWeapon;

public class RangerFactory implements EquipmentFactory {

    @Override
    public Weapon createWeapon() {
        return new RangerWeapon();
    }

    @Override
    public Armor createArmor() {
        return new RangerArmor();
    }
}
