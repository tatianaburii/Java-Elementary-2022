package ua.hillel.tatiana.homework8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class LotteryTicket {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("На скільки цифр ви хочете лотерейний квиток?");
        int size = Integer.parseInt(reader.readLine());
        System.out.println("Вкажіть діапазон, у якому будуть цифри лотерейного квитка,  min = ");
        int min = Integer.parseInt(reader.readLine());
        System.out.println("max = ");
        int max = Integer.parseInt(reader.readLine());

        int[] input = arrayInput(size);
        int[] random = arrayRandom(size, min, max);

        System.out.println("Кількість співпадінь: " + checkTicket(input, random));
    }

    public static int checkTicket(int[] input, int[] random) {
        int sum = 0;
        System.out.println("Індекси чисел що співпали: ");
        for (int i = 1; i < input.length; i++) {
            if (random[i] == input[i]) {
                System.out.println("i = " + i + " ");
                sum++;
            }
        }
        return sum;
    }

    public static int[] arrayRandom(int size, int min, int max) {
        int[] random = new int[size];
        for (int i = 0; i < random.length; i++) {
            random[i] = (int) (Math.random() * (max - min) + min);
        }
        Arrays.sort(random);
        return random;
    }

    public static int[] arrayInput(int size) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] input = new int[size];
        System.out.println("Введіть " + size + " цифр від 0 до 9:");
        for (int i = 0; i < input.length; i++) {
            input[i] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(input);
        return input;


    }

}