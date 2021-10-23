package ua.hillel.tatiana.homework4;

import java.util.Scanner;


public class Person {
    public static void main(String[] args) {
        System.out.println("Телефонна книга");

        /*Scanner in = new Scanner(System.in);

        System.out.println("Введіть ім'я :");
        String firstname = in.next();

        System.out.println("Введіть прізвище:");
        String laststname = in.next();

        System.out.println("Введіть місто:");
        String city = in.next();

        System.out.println("Введіть номер телефону:");
        String phone = in.next();
        System.out.println(personInfo(firstname,laststname, city,phone)); */

        System.out.println(personInfo("Ivan","Gilevych", "Verkhovyna", "888643134"));
        System.out.println(personInfo("Vasyl", "Gyta", "Koniatyn", "376543900"));
        System.out.println(personInfo("Petro", "Balmak", "Zarichne", "0438643864"));
    }
    public static String personInfo(String firstname, String lastname, String city, String phone ) {
        return "Подзвонити громадянину " + firstname + " " + lastname + " з міста " + city+ " можна по номеру: " + phone +"." + " Якщо вам не вдалося зв'язатися з абонентом - " +
                "залиште голосове повідомлення після сигналу.";
    }
}
