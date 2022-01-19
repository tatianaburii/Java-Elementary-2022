package ua.hillel.tatiana.elementary_homework_6;
import ua.hillel.tatiana.elementary_homework_6.dto.Phone;
import ua.hillel.tatiana.elementary_homework_6.service.imlp.PhoneService;
import ua.hillel.tatiana.elementary_homework_6.utils.PhoneGenerator;

import java.util.ArrayList;
import java.util.Comparator;



public class PhoneRun {
    public static void main(String[] args) {


        PhoneService service = new PhoneService();

        Comparator<Phone> comparator2 = Comparator.comparing(phone -> phone.getInternet());
        Comparator<Phone> comparator = Comparator.comparing(phone -> phone.getSurname());

        ArrayList<Phone> phones = new PhoneGenerator().generatePhone();


        service.checkTimeInCity(phones,500);
        service.checkTimeOutCity(phones);
        service.compare(phones, comparator);
        service.compareAndPrintInternetMax(phones, comparator2);

    }


}
