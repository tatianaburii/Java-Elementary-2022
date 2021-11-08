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

    public static RealEstate createRealEstate(RealEstateType type) {
        RealEstate realEstate = null;
        try {
            switch (type) {
                case DWELLING:
                    realEstate = new Dwelling(inputS(), inputTaxK(), inputPercent());
                    break;
                case RETAIL:
                    realEstate = new Retail(inputS(), inputTaxK(), inputRevenue());
                    break;

                case PRODUCTION:
                    realEstate = new Production(inputS(), inputTaxK());
                    break;
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
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
    public static int inputPercent() throws IOException {
        int percent;
        System.out.println("Input percent: ");
        percent = Integer.parseInt(reader.readLine());
        return percent;
    }
    public static int inputRevenue() throws IOException {
        int revenue;
        System.out.println("Input revenue: ");
        revenue = Integer.parseInt(reader.readLine());
        return revenue;
    }


}



