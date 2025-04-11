package com.sevval;

public class Monster {
    private int health;
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setHealth(int health) {
        if (health > 100 || health < 0) {
            throw new IllegalArgumentException("Health must be between 0 and 100");
        }
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void resetHealth() {
        health = 100;
    }

    public void decreaseHealth(int points) {
        health = health - points;
    }
}
