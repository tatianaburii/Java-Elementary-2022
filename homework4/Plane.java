package ua.hillel.tatiana.homework4;

import java.util.Scanner;

public class Plane {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введіть ім'я літака:");
        String name = in.next();

        System.out.println("Введіть моель літака:");
        String type = in.next();



        System.out.println("Введіть кількість місць в економ класі:");
        int econom = in.nextInt();

        System.out.println("Введіть кількість місць у бізнес класі:");
        int busines = in.nextInt();

        /*String name = "BOEING";
        String type = " 767";
        int econom = 459;
        int busines = 12;



       printAirplaneInfo(name, type, econom, busines);*/
        printAirplaneInfo("Jet", "657");

        if (busines <= 0) {
           printAirplaneInfo(name, type, econom);
       }
       if (econom <= 0) {
           printAirplaneInfo(name, type);
       }


    }
    public static void printAirplaneInfo(String name){
        System.out.println("Тип літака:" + name);

    }
    public static void printAirplaneInfo(String name, String type){
        System.out.println("Тип літака:" + name);
        System.out.println("Модель:" + type);

    }
    public static void printAirplaneInfo(String name, String type, int econom ){
        System.out.println("Тип літака:" + name);
        System.out.println("Модель:" + type);
        System.out.println("Максимальна кількість місць в економ класі:" + econom);

    }
    public static void printAirplaneInfo(String name, String type, int econom, int busines){
        System.out.println("Тип літака:" + name);
        System.out.println("Модель:" + type);
        System.out.println("Максимальна кількість місць в економ класі:" + econom);
        System.out.println("Максимальна кількість місць у бізнес класі:" + busines);
    }
}


