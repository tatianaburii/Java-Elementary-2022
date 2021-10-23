package ua.hillel.tatiana.lesson7;

import java.util.Scanner;

public class ArrayForPeople {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input array size:");
        int size = scanner.nextInt();
        String[] numbers = new String[size];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextLine();
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ",");
        }
    }
}

