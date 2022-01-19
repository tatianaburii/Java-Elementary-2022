package ua.hillel.tatiana.elementary_homework_6.service.imlp;

import ua.hillel.tatiana.elementary_homework_6.dto.Phone;
import ua.hillel.tatiana.elementary_homework_6.service.Calculable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PhoneService implements Calculable {

    public void checkTimeInCity(ArrayList<Phone> phones, int input) {
        System.out.println("Long \"calls in city\"  are longer than: " + input);
        System.out.println("------------------------------------");
        for (Phone phone : phones) {
            if (phone.getTimeInCity() > input) {
                System.out.println(phone);
            }
        }
        System.out.println("------------------------------------");
    }

    public void checkTimeOutCity(ArrayList<Phone> phones) {
        System.out.println("Subscribers used long-distance calls:");
        System.out.println("------------------------------------");
        for (Phone phone : phones) {
            if (phone.getTimeOutCity() > 0) {
                System.out.println(phone);
            }
        }
        System.out.println("------------------------------------");
    }

    public ArrayList<Phone> compare(ArrayList<Phone> phones, Comparator<Phone> comparator) {
        System.out.println("List of Subscribers: ");
        Collections.sort(phones, comparator);
        print(phones);
        return phones;
    }

    public void compareAndPrintInternetMax(ArrayList<Phone> phones, Comparator comparator) {
        System.out.println("10 Subscribers with the most internet traffic: ");
        Collections.sort(phones, comparator);
        for (int i = 0; i < 10; i++) {
            System.out.println(phones.get(i));
        }
        System.out.println("------------------------------------");

    }

    public void print(ArrayList<Phone> phones) {
        for (Phone phone : phones) {
            System.out.println(phone);
        }
        System.out.println("------------------------------------");
    }


}
