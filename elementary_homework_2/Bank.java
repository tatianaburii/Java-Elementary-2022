package ua.hillel.tatiana.elementary_homework_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bank {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        byte months = 12;
        System.out.println("Input money: ");
        double money = Double.parseDouble(reader.readLine());
        System.out.println("Input percent: ");
        double percent = Double.parseDouble(reader.readLine());
        System.out.println("Input years: ");
        byte years = Byte.parseByte(reader.readLine());

        Bank bank = new Bank();

        System.out.println("All sum: " + bank.calculateAllSum(months, money, percent, years));
        System.out.println("Percent: " + (bank.calculateAllSum(months, money, percent, years) - money));
        bank.calculateAndPrintSum(months, money, percent, years);

    }

    public double calculateAllSum(byte months, double money, double percent, byte years) {
        double a = 1 + percent / (100 * months);
        double b = months * years;
        return money * Math.pow(a, b);

    }

    public void calculateAndPrintSum(byte months, double money, double percent, byte years) {
        for (int i = 1; i < years; i++) {
            double a = 1 + percent / (100 * months);
            double b = months * i;
            double sum = money * Math.pow(a, b);
            System.out.println("Sum after " + i + " year: " + sum);
        }
    }


}
