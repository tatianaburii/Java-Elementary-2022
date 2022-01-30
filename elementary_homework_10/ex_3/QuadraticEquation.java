package ua.hillel.tatiana.elementary_homework_10.ex_3;

public class QuadraticEquation {
    double a;
    double b;
    double c;
    //3. написать программу для вычисления корней квадратного уравнения

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void getAndPrintRoots() {
        double d = b * b - 4 * a * c;
        if (d < 0) {
            System.out.println("This quadratic equation has no roots!");
        } else if (d == 0) {
            double x = (-1) * b / (2 * a);
            System.out.println("x1 = x2 = " + x);
        } else {
            double x1 = ((-1) * b - Math.sqrt(d)) / (2 * a);
            double x2 = ((-1) * b + Math.sqrt(d)) / (2 * a);
            System.out.println("x1 = " + x1 + "; x2 = " + x2);
        }
    }
}
