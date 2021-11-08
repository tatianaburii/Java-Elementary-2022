package ua.hillel.tatiana.homework13_1;


public class Dwelling extends RealEstate {
   private int percent;

    public Dwelling(int S, int taxK, int percent) {
        super(S, taxK);
        this.percent = percent;
    }

    @Override
    public double calculateTax() {
        double sumTax = S * taxK * (1 - percent / 100.0);
        return sumTax;
    }
}
