package ua.hillel.tatiana.lesson5;

import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in);
        System.out.println("print number:");
        int monthNumber = scanner.nextInt();
        switch (monthNumber) {
            case 1:
            case 2:
                System.out.println("winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("spring");
                break;
        }
    }
}
