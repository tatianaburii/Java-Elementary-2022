package ua.hillel.tatiana.homework13_1;

public class RealEstate {
    protected int S;
    protected int taxK;

    public RealEstate(int taxK, int S) {
        this.S = S;
        this.taxK = taxK;
    }

    public double calculateTax() {
        return S * taxK;
    }

}

