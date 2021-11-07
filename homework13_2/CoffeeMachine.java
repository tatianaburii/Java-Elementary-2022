package ua.hillel.tatiana.homework13_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CoffeeMachine {

    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        String input;
        ArrayList<Drink> drinks = new ArrayList<>();
        System.out.println(" What drink would you like?");

        while (!(input = reader.readLine()).equals("stop")) {
            try {
                drinks.add(chooseDrink(DrinkType.valueOf(input)));
            }
            catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
        calculateOrderPrice(drinks);
        printDrinkPrice(drinks);
    }

    public static Drink chooseDrink(DrinkType type) {
        Drink drink = null;
        switch (type) {

            case AMERICANO:
                drink = new Americano(50);
                break;
            case LATTE:
                drink = new Latte(60);
                break;
            case CAPPUCCINO:
                drink = new Cappuccino(60);
                break;
            case TEA:
                drink = new Tea(50);
                break;
        }
        return drink;
    }


    public static void calculateOrderPrice(ArrayList<Drink> drinks) {
        int orderPrice = 0;
        for (Drink drink : drinks) {
            orderPrice += drink.getPrice();
        }
        System.out.println("The price of your order:  " + orderPrice);

    }

    public static void printDrinkPrice(ArrayList<Drink> drinks) {
        for (Drink drink : drinks) {
            drink.makeDrink();
            System.out.println("Drink price: " + drink.price);
        }

    }

}
