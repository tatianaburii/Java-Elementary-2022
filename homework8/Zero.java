package ua.hillel.tatiana.homework8;

import java.util.Arrays;

public class Zero {
    public static void main(String[] args) {
        int[] random = {0, 2, 3, 4, 5, 6, 7, 5, 0, 9, 10, 11, 0, 12, 13, 14, 15, 16, 0};
        System.out.println("Array before: " + Arrays.toString(random));
        int sum = 0;
        for (int i = 0; i < random.length; i++) {
            if (random[i] == 0){
                sum++;
                random[i] = random[sum];
                random[sum - 1] = 0;
            }
        }
        System.out.println("Array after: " + Arrays.toString(random));

    }
}
