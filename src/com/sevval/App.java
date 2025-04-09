package com.sevval;

public class App {
    public static void main(String[] args) {
        Monster monster = new Monster();
        monster.health = 100;
        monster.type = "Fatmik";

        Player player = new Player();
        player.health = 100;
        player.name = "Aybik";
        player.age = 20;

        while (monster.health > 0 && player.health > 0) {
            System.out.println("Player " + player.name + " attack");
            monster.health = monster.health - getAttackPoint();

            if (monster.health <= 0) {
                break;
            }

            System.out.println("Monster " + monster.type + " attack");
            player.health = player.health - getAttackPoint();

            System.out.println("Player health: " + player.health);
            System.out.println("Monster health: " + monster.health);
        }
        System.out.println((player.health > 0 ? "Player " : "Monster ") + "WINS!");
        monster.resetHealth();
        player.resetHealth();
    }

    public static int getAttackPoint () {
        return 1 + (int) (Math.random() * 10);
    }
}
