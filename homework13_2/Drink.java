package ua.hillel.tatiana.homework13_2;

public class Drink {

    protected int price;

    public Drink(int price) {
        this.price = price;
    }

    public void makeDrink() {
        System.out.println("Make an drink!");
    }

    public int getPrice() {
        return price;
    }

}
