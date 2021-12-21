package ua.hillel.tatiana.elementary_homework_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MinMaxRevers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input array's length:");

        int n = Integer.parseInt(reader.readLine());
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);

        }
        System.out.println(Arrays.toString(numbers));

        int maxNumber = numbers[0];
        int minNumber = numbers[0];
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 1; i <numbers.length ; i++) {
            if(numbers[i] > maxNumber){
                maxNumber = numbers[i];
                maxIndex = i;
            }
            if (numbers[i] <minNumber){
                minNumber = numbers[i];
                minIndex = i;
            }

        }
        numbers[maxIndex] = minNumber;
        numbers[minIndex] = maxNumber;
        System.out.println(Arrays.toString(numbers));
    }
}
