package com.sevval;

public class Player {
    private int health;
    private String name;
    private int age;

    public Player(String name, int health, int age) {
        this.name = name;
        setHealth(health);
        setAge(age);
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        if (age < 10) {
            throw new IllegalArgumentException("Age must be at least 10");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void setHealth(int health) {
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
    
    public boolean isALive(){
        return health > 0;
    }
}
