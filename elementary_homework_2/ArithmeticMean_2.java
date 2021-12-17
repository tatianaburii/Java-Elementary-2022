package ua.hillel.tatiana.elementary_homework_2;

public class ArithmeticMean_2 {
    public static void main(String[] args) {
        double sum = 0;
        if (args.length == 2) {
            for (String str : args) {
                double i = Double.valueOf(str);
                sum += i;
            }
            System.out.println("Result: " + sum / 2);
        } else {
            System.out.println("The number of arguments is different from 2.");
        }
    }
}
