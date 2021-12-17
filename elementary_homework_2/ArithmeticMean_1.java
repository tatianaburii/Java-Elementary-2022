package homework2;

public class ArithmeticMean_1 {
    public static void main(String[] args) {
        int sum = 0;
        for (String str : args) {
            int i = Integer.valueOf(str);
            sum += i;
        }
        System.out.println("Result:" + sum / args.length);

    }
}

