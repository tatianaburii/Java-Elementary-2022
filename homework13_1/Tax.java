package ua.hillel.tatiana.homework13_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Tax {
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
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


    public static RealEstate createRealEstate(RealEstateType type) {
        RealEstate realEstate = null;
        switch (type) {
            case DWELLING:
                try {
                    realEstate = new Dwelling(inputS(), inputTaxK());
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
                break;

            case RETAIL:
                try {
                    realEstate = new Retail(inputS(), inputTaxK());
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
                break;

            case PRODUCTION:
                try {
                    realEstate = new Production(inputS(), inputTaxK());
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
                break;

        }
        return realEstate;
    }


    public static int inputS() throws IOException {
        int S;
        System.out.println("Input S: ");
        S = Integer.parseInt(reader.readLine());
        return S;
    }

    public static int inputTaxK() throws IOException {
        int taxK;
        System.out.println("Input taxK: ");
        taxK = Integer.parseInt(reader.readLine());
        return taxK;
    }

}



