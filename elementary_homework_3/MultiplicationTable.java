package ua.hillel.tatiana.elementary_homework_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiplicationTable {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input x from 1 to 10:");
        byte x = Byte.parseByte(reader.readLine());
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + x + " = " + (i*x));

        }
    }
}
