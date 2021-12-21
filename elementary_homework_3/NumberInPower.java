package ua.hillel.tatiana.elementary_homework_3;

public class NumberInPower {
    public static void main(String[] args) {
        int x = 3;
        int n = 6;
        int pow = 1;
       // System.out.println("x^n = " + Math.pow(x, n));
        for (int i = 1; i <=n ; i++) {
            pow = pow * x;
        }
        System.out.println("x^n = " + pow);

    }
}
