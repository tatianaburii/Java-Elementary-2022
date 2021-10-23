package ua.hillel.tatiana.homework10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecursionFactorial {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input numbers, pleas:");
        int number = Integer.parseInt(reader.readLine());
        System.out.println("number = " + number );
        System.out.println("numberFactorial = " + factorial(number));


    }

    public static int factorial(int number) {
        int numberFactorial = 1;
        if (number > 1) {
            numberFactorial = number * factorial(number - 1);
        }
        return numberFactorial;


    }
}
