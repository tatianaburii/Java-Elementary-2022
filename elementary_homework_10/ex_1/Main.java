package ua.hillel.tatiana.elementary_homework_10.ex_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 22; i++) {
            strings.add("number_" + i);
        }
        strings.add("number_20");
        strings.add("number_10");
        strings.add("number_16");
        printCollection(strings);
        strings = sort(strings);
        printCollection(strings);

    }
    //1. Напишите метод, который на вход получает коллекцию объектов, а возвращает коллекцию уже без дубликатов.

    public static ArrayList<String> sort(ArrayList<String> strings) {
        ArrayList<String> newStrings = new ArrayList<>();
        for (String s : strings) {
            int flag = 0;
            for (String newS : newStrings) {
                if (s.equals(newS)) {
                    flag = 1;
                    break;
                }}
            if (flag==0)
                newStrings.add(s);
        }
        return newStrings;

    }

    public static void printCollection(ArrayList<String> strings) {
        System.out.println("Collection {");
        for (String s : strings) {
            System.out.println(s);
        }
        System.out.println("}");
    }
}


