package ua.hillel.tatiana.homework7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.String;
import java.util.Arrays;

public class SequenceOfNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Задайте розмір масиву:");
        int size = Integer.parseInt(reader.readLine());
        int[] numbers = new int [size];
        System.out.println("Вводьте числа:");
        for (int i = 0; i < size; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }
        System.out.println("Масив з чисел, які ви ввели: numbers = " + Arrays.toString(numbers));
        boolean test = true;
        for (int i = 0; i < numbers.length -1; i++) {
            if ( numbers[i] >= numbers[i + 1]) {
                test = false;
                break;
            }
        }
        if (test){
            System.out.println("Ця послідовність є строго зростаючою!");
        }else {
            System.out.println("Ця послідовність не є строго зростаючою!");
        }





    }
}










