package ua.hillel.tatiana.homework13_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RealEstate {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    protected int S;
    protected int taxK;

    public RealEstate(int taxK, int S) {
        this.S = S;
        this.taxK = taxK;
    }

    public double calculateTax() throws IOException {
        int sumTax = S * taxK;
        return sumTax;
    }

}

