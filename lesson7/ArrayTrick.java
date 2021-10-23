package ua.hillel.tatiana.lesson7;

import java.util.Arrays;

public class ArrayTrick {
    public static void main(String[] args) {
        int[] numbers = {10,23,37,4,57};
        for (int number : numbers) {
            System.out.println(number +" ");;

        }
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

}
