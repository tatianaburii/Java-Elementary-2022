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

    public static RealEstate createRealEstate(RealEstateType type) throws IOException {
        switch (type) {
            case DWELLING:
                System.out.println("Input: S, taxK, percent.");
                return new Dwelling(inputData(), inputData(), inputPercent());
            case RETAIL:
                System.out.println("Input: S, taxK, revenue.");
                return new Retail(inputData(), inputData(), inputData());
            case PRODUCTION:
                System.out.println("Input: S, taxK.");
                return new Production(inputData(), inputData());
            default:
                throw new IllegalStateException("Unexpected value: " + type);
        }
    }

    public static int inputData() throws IOException {
        int input;
        input = Integer.parseInt(reader.readLine());

        if (input < 0) {
            System.out.println("Data entered incorrectly, please, try again");
            inputData();
        }
        return input;
    }

    public static int inputPercent() throws IOException {
        int input;
        input = Integer.parseInt(reader.readLine());

        if (input < 0 || input > 100) {
            System.out.println("Data entered incorrectly, please, try again");
            inputPercent();
        }
        return input;
    }
}



