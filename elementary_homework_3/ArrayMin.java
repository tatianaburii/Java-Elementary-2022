package ua.hillel.tatiana.elementary_homework_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArrayMin {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input array's length:");
        int n = Integer.parseInt(reader.readLine());
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }

        System.out.println(Arrays.toString(numbers));
        for (int i = 1; i < numbers.length - 1; i++) {
            if (numbers[i] < numbers[i + 1]) {
                int a = numbers[i + 1];
                numbers[i + 1] = numbers[i];
                numbers[i] = a;
            }

        }
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == numbers[numbers.length -1]){
                System.out.println("min number:" + numbers[i]);
            }

        }

    }
}
