package ua.hillel.tatiana.elementary_homework_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArithmeticMean {

    public static void main(String[] args) throws IOException {
        ArithmeticMean numbers = new ArithmeticMean();
        System.out.println("Result: " + numbers.calculateArithmeticMean());
    }
    public int calculateArithmeticMean()throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input first number:");
        int input_one = Integer.parseInt(reader.readLine());
        System.out.println("Input second number:");
        int input_two = Integer.parseInt(reader.readLine());
        return (input_one + input_two)/2;
    }
}

