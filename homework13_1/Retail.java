package ua.hillel.tatiana.homework13_1;

import java.io.IOException;

public class Retail extends RealEstate {
    public Retail(int S, int taxK) {
        super(S, taxK);
    }

    @Override
    public double calculateTax() throws IOException {
        System.out.println("Input revenue:");
        int revenue = Integer.parseInt(reader.readLine());
        int sumTax = S * taxK;
        if (revenue < 100) {
            sumTax = 0;
        }
        return sumTax;
    }
}
