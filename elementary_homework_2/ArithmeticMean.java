package ua.hillel.tatiana.elementary_homework_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArithmeticMean {

    public static void main(String[] args) throws IOException {
        ArithmeticMean numbers = new ArithmeticMean();
        System.out.println("Result: " + numbers.calculateArithmeticMean());
    }
    public double calculateArithmeticMean()throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input first number:");
        double input_one = Double.parseDouble(reader.readLine());
        System.out.println("Input second number:");
        double input_two = Double.parseDouble(reader.readLine());
        return (input_one + input_two)/2;
    }
}

