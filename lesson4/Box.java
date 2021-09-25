package ua.hillel.tatiana.lesson4;

public class Box {
    public static void main(String[] args) {
        double a, b, c;
        a =18.9;
        b = 10;
        c =6.5;
        double volume = calculateVolume(a, b, c);
        System.out.println( "volume:" + volume);
        System.out.println("new volume:" + calculateVolume(50,40, 1.2));
        System.out.println("three volume:" +calculateVolume(1.5, 12, 3) );
        calculateVolume(50,40, 1.2);
        calculateVolume(1.5, 12, 3);
    }
    public static double calculateVolume( double a, double b, double c) {
        return c * a * b;
    }
}
