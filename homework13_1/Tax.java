package ua.hillel.tatiana.homework13_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Tax {
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        String input;
        ArrayList<RealEstate> realEstates = new ArrayList<>();

        while (!(input = reader.readLine()).equals("exit")) {
            try {
                realEstates.add(createRealEstate(RealEstateType.valueOf(input)));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        for (RealEstate taxes1 : realEstates) {
            System.out.println("Tax = " + taxes1.calculateTax());
        }
    }

    public static RealEstate createRealEstate(RealEstateType type) throws IOException{
        RealEstate realEstate = null;
            switch (type) {
                case DWELLING:
                    System.out.println("Input: S, taxK, percent.");
                    realEstate = new Dwelling(inputData(),inputData(),inputData());
                    break;
                case RETAIL:
                    System.out.println("Input: S, taxK, revenue.");
                    realEstate = new Retail(inputData(),inputData(),inputData());
                    break;

                case PRODUCTION:
                    System.out.println("Input: S, taxK.");
                    realEstate = new Production(inputData(),inputData());
                    break;
            }
        return realEstate;
    }
    public static int inputData() throws IOException {
        int input;
        input = Integer.parseInt(reader.readLine());
        return input;
    }
}



