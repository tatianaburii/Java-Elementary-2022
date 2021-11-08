package ua.hillel.tatiana.homework13_1;


public class Retail extends RealEstate {
    private int revenue;
    public Retail(int S, int taxK, int revenue) {
        super(S, taxK);
        this.revenue = revenue;
    }

    @Override
    public double calculateTax() {

        if (revenue < 100.0) {
            return 0;
        }
        return S * taxK;
    }
}
