package ua.hillel.tatiana.lesson5;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ball = in.nextInt();

        if (ball < 100) {
            System.out.println("take you 0");
        }if (ball >= 100 || ball < 500) {
            System.out.println("take you 10000$");
        }else if ( ball>=500 || ball<1000 ) {
                System.out.println("take you 20000$");
            }
        else {
                    System.out.println("Take you 50000$");
        }


    }
}
