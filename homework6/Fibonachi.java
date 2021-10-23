package ua.hillel.tatiana.homework6;

import java.util.Scanner;

public class Fibonachi {
    public static void main(String[] args) {
        int n1, n2, n3, k;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Скільки чисел Фібоначі потрібно вивести?");
        k = scanner.nextInt();
        // k - number of numbers Fibonachi
        n1 = 1;
        n2 = 1;
        n3 = n1 + n2;
        if (k == 1) {
            System.out.println(n1);
        }
        else if (k == 2) {
            System.out.print(n1 + " " + n2);
        }
        else
        System.out.print(n1 + " " + n2 + " " + n3 + " ");
        for (int i = 1; i < (k - 2); i++) {
            n1 = n2;
            n2 = n3;
            n3 = n1 + n2;
            System.out.print( n3 + "  ");

        }

    }
}
