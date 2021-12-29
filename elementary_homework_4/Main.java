package ua.hillel.tatiana.elementary_homework_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        Machine machine = new Machine(40, 12, 7);

        double i = Double.parseDouble(String.join("", args));

        double price = (i * machine.calculateAndPrintAddGasoline(inputData()));
        System.out.println("Необхідно заправитись на суму (у гривнях): " + price);

        machine.calculateTheRestGasoline(inputData());
        System.out.println("Заправка у Кривому Озері: ");
        machine.fillFullTank();

        machine.calculateTheRestGasoline(inputData());
        System.out.println("Заправка у Жмеринці: ");
        machine.fillFullTank();

        double sum = i * (machine.getCOUNT() - machine.calculateTheRestGasoline(inputData()));
        System.out.println("Вартість поїздки: " + sum);



    }

    public static int inputData() throws IOException {
        System.out.println("Введіть шлях: ");
        return Integer.parseInt(reader.readLine());
    }
}
