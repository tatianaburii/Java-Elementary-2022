package ua.hillel.tatiana.lesson3;

public class JavaMath {
    public static void main(String[] args) {
       int result = Math.abs(-200);
        System.out.println(result);
        double pow = Math.pow(2,8);
        System.out.println(pow);

        long round = Math.round(5.9);
        System.out.println(round);
         double random = Math.random();
        System.out.println((int) (random*100));
    }
}
