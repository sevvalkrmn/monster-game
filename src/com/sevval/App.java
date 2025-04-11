package com.sevval;

public class App {
    public static void main(String[] args) {
        Monster monster = new Monster();
        monster.setHealth(100);
        monster.setType("Fatmik");

        Player player = new Player();
        player.setHealth(100);
        player.setName("Aybik");
        player.setAge(20);

        while (monster.getHealth() > 0 && player.getHealth() > 0) {
            System.out.println("Player " + player.getName() + " attack");
            monster.decreaseHealth(getAttackPoint());

            if (monster.getHealth() <= 0) {
                break;
            }

            System.out.println("Monster " + monster.getType() + " attack");
            player.decreaseHealth(getAttackPoint());

            System.out.println("Player health: " + player.getHealth());
            System.out.println("Monster health: " + monster.getHealth());
        }
        System.out.println((player.getHealth() > 0 ? "Player " : "Monster ") + "WINS!");
        monster.resetHealth();
        player.resetHealth();
    }

    public static int getAttackPoint () {
        return 1 + (int) (Math.random() * 10);
    }
}
