package ua.hillel.tatiana.homework13_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RealEstate {
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    protected int S;
    protected int taxK;

    public RealEstate(int taxK, int S) {
        this.S = S;
        this.taxK = taxK;
    }

    public void calculateTax() throws IOException {
        int sumTax = S * taxK;
        System.out.println("tax = " + sumTax);
    }

}

