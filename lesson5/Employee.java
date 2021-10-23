package ua.hillel.tatiana.lesson5;

import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("input expiriens:");
        int year = scanner.nextInt();
        System.out.println("input salary:");
        int salary = scanner.nextInt();
        int mouns = 12;
        int bonus = 100;
        int sum = year * mouns * salary;
        if (year>= 5) {
            System.out.println("sum:" + (sum + bonus));
        }else {
                System.out.println(sum);
            }

    }
    }

