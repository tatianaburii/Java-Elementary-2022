package ua.hillel.tatiana.lesson8;

import java.util.Arrays;

public class ArraysClassSort {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }
        long start, end;
        start = System.currentTimeMillis();
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {

                if (numbers[j] > numbers[j + 1]) {
                    int buffer;
                    buffer = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = buffer;
                }
            }

        }
        System.out.println(Arrays.toString(numbers));
        end = System.currentTimeMillis();
        System.out.println("Duretion= " + (end - start));


    }

}
