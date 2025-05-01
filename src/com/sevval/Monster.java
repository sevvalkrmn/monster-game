package com.sevval;

public class Monster {
    private int health;
    private String type;

    public Monster(int health, String type) {
        setHealth(health);
        this.type = type;
    }

    public Monster(int health) {
        setHealth(health);
    }

    public String getType() {
        return type;
    }

    private void setHealth(int health) {
        if (health > Game.FULL_HEALTH) {
            throw new IllegalArgumentException("Health must be between 0 and 100");
        }
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void resetHealth() {
        health = Game.FULL_HEALTH;
    }

    public void decreaseHealth(int points) {
        health = health - points;
    }

    public boolean isALive(){
        return health > 0;
    }
}
