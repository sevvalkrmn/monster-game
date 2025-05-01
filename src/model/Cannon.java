package model;

public class Cannon extends Tools {
    private int numberOfCannonBalls;

    public Cannon(int numberOfCannonBalls){
        super(15,20);
        this.numberOfCannonBalls = numberOfCannonBalls;
    }
    
    public int getNumberOfCannonBalls() {
        return numberOfCannonBalls;
    }
    public void setNumberOfCannonBalls(int numberOfCannonBalls) {
        this.numberOfCannonBalls = numberOfCannonBalls;
    }
   

}
