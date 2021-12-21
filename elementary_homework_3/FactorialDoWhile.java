package ua.hillel.tatiana.elementary_homework_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactorialDoWhile {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input n:");
        int n = Integer.parseInt(reader.readLine());
        int result = 1;
        do{
            result = result * n;
            n--;
        }while (n>0);
        System.out.println("result = " + result);

    }
}
