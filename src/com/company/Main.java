package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss1 = new Boss();
        Weapon weapon1 = new Weapon();
        boss1.setDamage(50);
        boss1.setHealth(500);
        boss1.setSuperAbility("Physical");
        weapon1.setWeaponType("Firearms");
        weapon1.setWeaponName("Revolver");
        boss1.setWeapon(weapon1);

        System.out.println(boss1.getDamage() + " " + boss1.getHealth() + " " + boss1.getSuperAbility() + " " + weapon1.getWeaponType() + " " + weapon1.getWeaponName());
    }
}




