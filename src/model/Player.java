package model;

public class Player extends GameElement {
    private String name;
    private int age;

    public Player(String name, int age) {
        this.name = name;
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

}
