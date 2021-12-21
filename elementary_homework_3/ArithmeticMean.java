package ua.hillel.tatiana.elementary_homework_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArithmeticMean {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input array's length:");

        int n = Integer.parseInt(reader.readLine());
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);

        }
        System.out.println(Arrays.toString(numbers));
        double sum = 0;
        for (int i: numbers) {
            sum += i;
        }
        System.out.println("result: " + sum/n);
    }
}
