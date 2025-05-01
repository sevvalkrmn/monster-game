package model;
import com.sevval.Game;

public class GameElement {
    private int health;

    public GameElement(){
        setHealth(Game.FULL_HEALTH);
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
