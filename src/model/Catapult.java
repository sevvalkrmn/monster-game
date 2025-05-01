package model;

public class Catapult extends Tools {
    private int numberOfRocks;

    public Catapult(int numberOfRocks){
        super(20,25);
        this.numberOfRocks = numberOfRocks;
    }

    public int getNumberOfRocks() {
        return numberOfRocks;
    }
    public void setNumberOfRocks(int numberOfRocks) {
        this.numberOfRocks = numberOfRocks;
    }
   

}
