package ua.hillel.tatiana.lesson8;

import java.util.Arrays;

public class BinarySort {
    public static void main(String[] args) {
        int key = 27;
        int[] numbers = {1, 2, 3, 5, 67, 89, 9, 4, 53, 27, 33};

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        int low = 0;
        int high = numbers.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (numbers[mid] < key) {
                low = mid + 1;
            } else if (numbers[mid] > key) {
                high = mid - 1;
            } else {
                System.out.println(mid);
                break;
            }
        }

    }
}
