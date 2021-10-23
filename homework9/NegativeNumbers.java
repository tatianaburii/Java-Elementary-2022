package ua.hillel.tatiana.homework9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NegativeNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Задайте кількість рядків M = :");
        int M = Integer.parseInt(reader.readLine());
        System.out.println("Задайте кількість стовбців N = :");
        int N = Integer.parseInt(reader.readLine());
        System.out.println("Вкажіть діапазон, у якому будуть числа,  min = ");
        int min = Integer.parseInt(reader.readLine());
        System.out.println("max = ");
        int max = Integer.parseInt(reader.readLine());
        System.out.println("random: ");
        int[][] random = arrayRandom(N, M, min, max);
        printMatrix(random);
        System.out.println("Індекси від'ємних чисел:");
        checkNumber(random);


    }

    public static int[][] arrayRandom(int M, int N, int min, int max) {
        int[][] random = new int[M][N];
        for (int i = 0; i < random.length; i++) {
            for (int j = 0; j < random[i].length; j++) {
                random[i][j] = (int) (Math.random() * (max - min) + min);
            }
        }
        return random;
    }

    public static void printMatrix(int[][] random) {
        for (int i = 0; i < random.length; i++) {
            for (int j = 0; j < random[i].length; j++) {
                System.out.print(random[i][j] + "   ");

            }
            System.out.println();
        }
    }
    public static void checkNumber(int[][] random) {
        for (int i = 0; i < random.length; i++) {
            for (int j = 0; j < random[i].length; j++) {
                if (random[i][j] < 0) {
                    System.out.println("[i,j] = [" + i + ", " + j + "];");

                }
            }
        }


    }
}
