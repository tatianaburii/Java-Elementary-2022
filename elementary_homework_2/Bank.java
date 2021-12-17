package ua.hillel.tatiana.elementary_homework_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bank {
    public BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        Bank bank = new Bank();
        System.out.println(bank.pow());

    }

    public double pow() throws IOException {
        int months = 12;
        System.out.println("Input money:");
        double money = Double.parseDouble(reader.readLine());
        System.out.println("Input percent:");
        double percent = Double.parseDouble(reader.readLine());
        System.out.println("Input years:");
        int years = Integer.parseInt(reader.readLine());
        double a = 1 + percent / (100 * months);
        double b = months * years;
        return money * Math.pow(a, b);

    }


}
