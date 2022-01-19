package ua.hillel.tatiana.elementary_homework_6.service;

import ua.hillel.tatiana.elementary_homework_6.dto.Phone;

import java.util.ArrayList;

public interface Calculable {
    void checkTimeInCity(ArrayList<Phone> phones, int input);
    void checkTimeOutCity(ArrayList<Phone> phones);


}
