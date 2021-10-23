package ua.hillel.tatiana.homework6;

import java.util.Scanner;
public class Luck {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = (int) (Math.random() * 10);
        System.out.println("Ну що, перевіримо вдачу? Яке число від 0 до 10 загадав комп'ютер ?");
        int input = scanner.nextInt();

        while ( !(input == number)) {
            System.out.println("Не вгадав. Спробуй ще раз!");
            input = scanner.nextInt();
        }

        System.out.println(" А ти чітер!");
    }

}

