package ua.hillel.tatiana.lesson8;

import java.util.Arrays;
import java.util.Collections;

public class ArraysSort {
    public static void main(String[] args) {
        Integer[] numbers = new Integer[15];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }
        long start, end;

        start = System.currentTimeMillis();
        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println(Arrays.toString(numbers));
        end = System.currentTimeMillis();
        System.out.println("Duration= " + (end - start));
    }
}
