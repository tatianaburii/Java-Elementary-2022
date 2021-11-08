package ua.hillel.tatiana.homework13_1;



public class Production extends RealEstate {

    public Production(int S, int taxK) {
        super(S, taxK);
    }

    public double calculateTax() {
        int sumTax = S * taxK;
        return sumTax;
    }
}
