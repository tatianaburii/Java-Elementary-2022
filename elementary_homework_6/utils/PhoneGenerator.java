package ua.hillel.tatiana.elementary_homework_6.utils;

import ua.hillel.tatiana.elementary_homework_6.dto.Phone;

import java.util.ArrayList;

public class PhoneGenerator {
    public static ArrayList<Phone> generatePhone(){
        ArrayList<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Bryk", "Ivan", "Ivanovch", 1, "Odessa", "099475645546",
                "5478647856456438", 1234, 1267, 894, 906, 47));
        phones.add(new Phone("Ast", "Oleg", "Ivanovch", 1, "Odessa", "099475645546",
                "5478647856456438", 1234, 1267, 494, 578, 97));
        phones.add(new Phone("Aart", "Egor", "Ivanovch", 1, "Odessa", "099475645546",
                "5478647856456438", 1234, 1267, 904, 118, 67));
        phones.add(new Phone("Ivanov", "Ostap", "Ostapovich", 1, "Odessa", "099475645546",
                "5478647856456438", 1234, 1267, 994, 0, 12));
        phones.add(new Phone("Vasiliev", "Igor", "Ostapovich", 1, "Odessa", "099475645546",
                "5478647856456438", 1234, 1267, 694, 214, 54));
        phones.add(new Phone("Petrov", "Mykola", "Ostapovich", 1, "Odessa", "099475645546",
                "5478647856456438", 1234, 1267, 94, 0, 143));
        phones.add(new Phone("Artem", "Slava", "Olegovich", 1, "Odessa", "099475645546",
                "5478647856456438", 1234, 1267, 994, 21, 67));
        phones.add(new Phone("Kravets", "Sava", "Olegovich", 1, "Odessa", "099475645546",
                "5478647856456438", 1234, 1267, 994, 214, 7));
        phones.add(new Phone("Baran", "Katia", "Igorivna", 1, "Odessa", "099475645546",
                "5478647856456438", 1234, 1267, 794, 87, 6));
        phones.add(new Phone("Gavan", "Tania", "Igorivna", 1, "Odessa", "099475645546",
                "5478647856456438", 1234, 1267, 1094, 29, 69));
        phones.add(new Phone("Ram", "Olia", "Igorivna", 1, "Odessa", "099475645546",
                "5478647856456438", 1234, 1267, 594, 90, 74));
        phones.add(new Phone("Smile", "Vika", "Igorivna", 1, "Odessa", "099475645546",
                "5478647856456438", 1234, 1267, 194, 0, 90));


        return phones;
    }

}
