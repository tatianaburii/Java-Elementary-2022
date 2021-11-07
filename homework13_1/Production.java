package ua.hillel.tatiana.homework13_1;

public class Production extends RealEstate {
    public Production(int S, int taxK) {
        super(S, taxK);
    }

    public void calculateTax() {
        int sumTax = S * taxK;
        System.out.println("Production tax = " + sumTax);
    }
}
