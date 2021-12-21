package ua.hillel.tatiana.elementary_homework_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input n:");
        int n = Integer.parseInt(reader.readLine());
        int result = 1;
        for (int i = n; i > 0; i--) {
            result = result * i;
        }
        System.out.println(n + "! = " + result);

    }
}
