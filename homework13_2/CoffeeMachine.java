package ua.hillel.tatiana.homework13_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CoffeeMachine {
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println(" What drink would you like?");

        ArrayList<Drink> drinks = makeOrder();
        printDrinkPrice(drinks);
        calculateOrderPrice(drinks);

    }

    public static ArrayList<Drink> makeOrder() throws IOException {
        ArrayList<Drink> drinks = new ArrayList<>();
        String input;
        while (!(input = reader.readLine()).equals("stop")) {
            Drink drink;
            switch (input) {

                case "americano":
                    drink = new Americano(50);
                    drinks.add(drink);
                    break;
                case "latte":
                    drink = new Latte(60);
                    drinks.add(drink);
                    break;
                case "cappuccino":
                    drink = new Cappuccino(60);
                    drinks.add(drink);
                    break;
                case "tea":
                    drink = new Tea(50);
                    drinks.add(drink);
                    break;

                default:
                    System.out.println("Unknown coffee type!");
            }
        }
        return drinks;
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
