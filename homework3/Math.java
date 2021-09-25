package ua.hillel.tatiana.homework3;

import java.util.Scanner;

public class Math {
    public static void main(String[] args) {
        double a, b, c, result;
        System.out.println("Введіть числове значення змінної (а) з клавіатури:");
        Scanner scannerQ = new Scanner(System.in);
        a = scannerQ.nextInt();
        System.out.println("Введіть числове значення змінної (b) з клавіатури:");
        b = scannerQ.nextInt();
        System.out.println("Введіть числове значення змінної (c) з клавіатури:");
        c = scannerQ.nextInt();
        result = java.lang.Math.abs(a - b) / java.lang.Math.pow((a + b), 3) - java.lang.Math.pow(c, 0.5);
        if (a == -b) {
            System.out.println("На 0 не можна ділити - математична поліція уже в дорозі! Вас буде покарано!");
        }
        else {
        System.out.println("result=" +result);}
    }
}


