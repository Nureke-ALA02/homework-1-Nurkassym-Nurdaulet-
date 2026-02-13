package com.narxoz.rpg.equipment;

public class PlateArmor implements Armor {

    private int defense;
    private String armorType;
    private String specialProperty;
    private double weight;

    public PlateArmor() {
        this.defense = 50;
        this.armorType = "Heavy";
        this.specialProperty = "None"; // Medieval armor has no magic bonus
        this.weight = 30.0; // in kilograms
    }

    @Override
    public int getDefense() {
        return defense;
    }

    @Override
    public String getArmorType() {
        return armorType;
    }

    @Override
    public String getArmorInfo() {
        return "Plate Armor (Medieval) - Heavy armor providing maximum protection. " +
                "Weight: " + weight + "kg";
    }

    @Override
    public String getSpecialProperty() {
        return specialProperty;
    }

    public void displayInfo() {
        System.out.println(getArmorInfo());
        System.out.println("Defense: " + defense);
        System.out.println("Type: " + armorType);
        System.out.println("Special: " + specialProperty);
        System.out.println("Weight: " + weight + "kg");
    }
}
