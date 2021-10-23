package ua.hillel.tatiana.homework5;

import java.util.Scanner;

public class HandLuggage {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Для того, щоб визначити, чи можна вважати ваш багаж ручною поклажею, " +
                "введіть його розміри у сантиметрах:");

        System.out.println("Висота:");
        short height = scanner.nextShort();

        System.out.println("Ширина:");
        short width = scanner.nextShort();

        System.out.println("Довжина:");
        short depth = scanner.nextShort();

        if (height <= 53 && width <= 22 && depth <= 40) {
            System.out.println("Так, це ручна поклажа!");
        }
        else if (height <= 40 && width <= 20 && depth <= 55) {
            System.out.println("Так, це ручна поклажа!");

        }
        else {
            System.out.println("На жаль, ваш багаж не пройде як ручна поклажа!");
        }



    }
}
