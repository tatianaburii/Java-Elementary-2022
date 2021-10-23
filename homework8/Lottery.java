package ua.hillel.tatiana.homework8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Lottery {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("На скільки цифр ви хочете лотерейний квиток?");
        int size = Integer.parseInt(reader.readLine());
        int[] random = new int[size];
        for (int i = 0; i < random.length; i++) {
            random[i] = (int) (Math.random() * 9 );
        }
        Arrays.sort(random);
        int[] input = new int[size];
        System.out.println("Введіть " + size + " цифр від 0 до 9:");
        for (int i = 0; i < input.length; i++) {
            input[i] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(input);
        System.out.println("Згенеровані числа: " + Arrays.toString(random));
        System.out.println("Введені числа гравцем: " + Arrays.toString(input));
        Arrays.sort(input);
            int sum = 0;
            System.out.println("Співпали цифри з індексом:");

            for (int i = 1; i < input.length; i++) {
                if (random[i] == input[i]) {
                    System.out.println("i = " + i + " ");
                    sum++;
                }
            }
            if (sum == 0) {
                System.out.println("--game over, go to work--");

            } else {
                System.out.println("Кількість співпадінь = " + sum + ".");
            }
    }

}
