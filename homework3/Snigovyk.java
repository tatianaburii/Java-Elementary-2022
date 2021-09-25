package ua.hillel.tatiana.homework3;

import java.util.Scanner;

public class Snigovyk {
    public static void main(String[] args) {
        double r1, r2, r3, v, m, p;
        final double Pi = 3.1415926536;
        System.out.println("Категорично не згодна з густиною снігу - даю шанс ввести щось більше схоже на правду:");
        Scanner scannerQ = new Scanner(System.in);
        p = scannerQ.nextInt();

        r1 = 1;
        r2 = 0.5;
        r3 = 0.2;
        m = 4 * p * Pi * (java.lang.Math.pow(r1, 3) + java.lang.Math.pow(r2, 3) + java.lang.Math.pow(r3, 3)) / 3;
        if (p > 100) {
            System.out.println(" Маса сніговика m=" + m);
        } else {
            System.out.println("Загугліть таблицю густини і повторіть спробу!");
        }
        if (p < 0) {
            System.out.println("Ей! Густина не буває вид'ємною ^_^!");
        }
        if (p > 400) {
            System.out.println("Такого сніговика зліплять хіба діти Гулівера!");
        }

    }
}

