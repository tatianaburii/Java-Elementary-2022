package ua.hillel.tatiana.elementary_homework_3;


import java.util.Arrays;

public class ArrayTenNumbers {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 2 * i + 1;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
