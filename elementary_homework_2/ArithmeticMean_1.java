package ua.hillel.tatiana.elementary_homework_2;

public class ArithmeticMean_1 {
    public static void main(String[] args) {
        double sum = 0;
        for (String str : args) {
            double i = Double.valueOf(str);
            sum += i;
        }
        System.out.println("Result:" + sum / args.length);

    }
}

