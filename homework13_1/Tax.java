package ua.hillel.tatiana.homework13_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Tax {
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        ArrayList<RealEstate> realEstates = createRealEstate();

        for (RealEstate taxes1 : realEstates) {
            taxes1.calculateTax();
        }
    }


    public static ArrayList<RealEstate> createRealEstate() throws IOException {
        ArrayList<RealEstate> taxes = new ArrayList<>();
        String input;
        while (!(input = reader.readLine()).equals("exit")) {
            RealEstate realEstate;
            int S;
            int taxK;
            switch (input) {
                case "dwelling":
                    System.out.println("Input S: ");
                    S = Integer.parseInt(reader.readLine());

                    System.out.println("Input texK:");
                    taxK = Integer.parseInt(reader.readLine());

                    realEstate = new Dwelling(S, taxK);
                    taxes.add(realEstate);
                    break;

                case "retail":
                    System.out.println("Input S: ");
                    S = Integer.parseInt(reader.readLine());

                    System.out.println("Input texK:");
                    taxK = Integer.parseInt(reader.readLine());

                    realEstate = new Retail(S, taxK);
                    taxes.add(realEstate);
                    break;

                case "production":
                    System.out.println("Input S: ");
                    S = Integer.parseInt(reader.readLine());

                    System.out.println("Input texK:");
                    taxK = Integer.parseInt(reader.readLine());

                    realEstate = new Production(S, taxK);
                    taxes.add(realEstate);
                    break;

                default:
                    System.out.println("Unknown tax type!");
            }
        }
        return taxes;
    }

}



