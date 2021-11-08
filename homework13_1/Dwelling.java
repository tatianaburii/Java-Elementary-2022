package ua.hillel.tatiana.homework13_1;

import java.io.IOException;

public class Dwelling extends RealEstate {
    public Dwelling(int S, int taxK) {
        super(S, taxK);
    }

    @Override
    public double calculateTax() throws IOException {
        System.out.println("Input percent of subsidy:");
        double percent = Integer.parseInt(reader.readLine());
        double sumTax = S * taxK * (1 - percent / 100);
        return sumTax;
    }

}
