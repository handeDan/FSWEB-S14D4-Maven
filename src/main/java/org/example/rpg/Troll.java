package org.example.rpg;

public class Troll extends Monster implements Bleedable, Poisonable{
    public Troll(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double bleed(){
        return getDamage()*0.25;
    }

    @Override
    public double poison() {
        return getDamage()*0.3;
    }

    @Override
    public double attack() {
        return getDamage() + bleed() + poison();
    }

    //methods:
    @Override
    public void characterDetails() {
        System.out.println("Character name: " + getName());
        System.out.println("Character damage: " + getDamage());
        System.out.println("Character hit points: " + getHitPoints());
        System.out.println("Character poison: " + poison());
    }
}
