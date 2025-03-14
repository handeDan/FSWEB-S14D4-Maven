package org.example.rpg;

public abstract class Monster {
    //instance variables:
    private String name;
    private int hitPoints;
    private double damage;

    //constructor:
    public Monster(String name, int hitPoints, double damage) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.damage = damage;
    }

    //getter methods:
    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public double getDamage() {
        return damage;
    }

    public double attack() {
        return getDamage();
    }

    //abstract methods:
    public abstract void characterDetails();
}
