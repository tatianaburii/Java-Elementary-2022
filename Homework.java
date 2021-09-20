package ua.hillel.tatiana;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
       int a, b, c;
        System.out.println( "Введіть числові значення з клавіатури");
        Scanner scannerQ = new Scanner(System.in);
        a = scannerQ.nextInt();
        b = scannerQ.nextInt();
        System.out.println("a="+ a +" b=" + b );
        c = a;
        a = b;
        b = c;
        System.out.println("a="+ a +" b=" + b );





    }
}
