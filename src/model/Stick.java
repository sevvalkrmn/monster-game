package model;

public class Stick extends Tools {
    
    private int durability;

    public Stick(int durability){
        super(10,5);
        this.durability = durability;
    }
    
    public int getDurability() {
        return durability;
    }
    public void setDurability(int durability) {
        this.durability = durability;
    }

}
