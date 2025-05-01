package model;

public class Tools {
    private int power;
    private int price;

    public Tools(int power, int price){
        this.power = power;
        this.price = price;

    }

    public int getPower() {
        return power;
    }
    public void setPower(int power) {
        this.power = power;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

}
