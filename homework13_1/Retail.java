package ua.hillel.tatiana.homework13_1;


public class Retail extends RealEstate {
     private int revenue;
    public Retail(int S, int taxK, int revenue) {
        super(S, taxK);
        this.revenue = revenue;
    }

    @Override
    public double calculateTax() {
        int sumTax = S * taxK;
        if (revenue < 100.0) {
            sumTax = 0;
        }
        return sumTax;
    }
}
