package ua.hillel.tatiana.lesson6;

import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("stop")) {
            int number = Integer.parseInt(input);
            System.out.println("*******  " + input);
            input = scanner.nextLine();


         /* while(!(input = scaner.nextLine()).equals("stop")){
            System.out.println(input);}*/




        }


    }
}
