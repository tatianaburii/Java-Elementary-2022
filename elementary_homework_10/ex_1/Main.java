package ua.hillel.tatiana.elementary_homework_10.ex_1;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 22; i++) {
            strings.add("number_" + i);
        }
        strings.add("number_20");
        strings.add("number_10");
        strings.add("number_16");

        for (String s : strings) {
            System.out.println(s);

        }
        System.out.println("---------------------");

        HashSet<String> strings1 = sort(strings);
        for (String s : strings1) {
            System.out.println(s);

        }

    }
    //1. Напишите метод, который на вход получает коллекцию объектов, а возвращает коллекцию уже без дубликатов.

    public static HashSet<String> sort(ArrayList<String> strings) {
        return new HashSet<>(strings);
    }

}


