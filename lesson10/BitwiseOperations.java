package ua.hillel.tatiana.lesson10;

public class BitwiseOperations {
    public static void main(String[] args) {
       /* Integer number = 46;
        System.out.println(number);
        System.out.println(Integer.toBinaryString(number));
        Integer notNumber = ~number;
        System.out.println(Integer.toBinaryString(notNumber));
        System.out.println(notNumber);*/

        int n1 = 56;
        int n2 = 34;

        System.out.println("56 ^ 34 = " + Integer.toBinaryString(n1 ^ n2));
        System.out.println("56 ^ 34= " + (n1 ^ n2));

        int n = 47;
        System.out.println(n + " " + Integer.toBinaryString(n));
        System.out.println(n + " << 1 = " + Integer.toBinaryString(n >> 1));
        System.out.println(n + " << 1 = " + (n >> 1));




    }
}
