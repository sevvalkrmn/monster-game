package com.sevval;

import java.util.Scanner;
import model.Player;
import model.Monster;



public class Game {
    public static final int FULL_HEALTH = 100;

    private Player player;
    private Monster monster;

    public void startGame(){
        buildPlayer();
        buildMonster();
        do {
            startAttacks();
            resetHealth();
            } while (shouldContinue());
    }

    private void startAttacks() {
        while (monster.isALive() && player.isALive()) {
            System.out.println("Player " + player.getName() + " attack");
            monster.decreaseHealth(getAttackPoint());

            if (!monster.isALive()) {
                break;
            }

            System.out.println("Monster " + monster.getType() + " attack");
            player.decreaseHealth(getAttackPoint());

            printHealthStatus();
        }
        System.out.println((player.isALive() ? "Player " : "Monster ") + "WINS!");
    }

    private void resetHealth() {
        monster.resetHealth();
        player.resetHealth();
    }

    private void printHealthStatus() {
        System.out.println("Player health: " + player.getHealth());
        System.out.println("Monster health: " + monster.getHealth());
    }

    private static int getAttackPoint () {
        return 1 + (int) (Math.random() * 10);
    }

    private void buildPlayer(){
        String name = askName();
        int age = askAge();
        player = new Player(name, age);
    } 

    private void buildMonster(){
        monster = new Monster( "Fatmik");
    }

    private String askName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        return scanner.nextLine(); 
    }

    private int askAge(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        return scanner.nextInt();

    }

    private boolean shouldContinue(){
        System.out.println("Do you want to play again? (Yes or No)");
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();
            return answer.trim().toLowerCase().equals("yes");

    }
    
}
