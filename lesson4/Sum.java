package ua.hillel.tatiana.lesson4;

public class Sum {
    public static void main(String[] args) {
        int a,b;
        a= 6;
        b= 9;
        int sum = calculateSum(a, b);
        System.out.println("sum=" + sum);
        System.out.println(calculateSum(10L, 15L));



    }
    public static int calculateSum( int a, int b){
     return a + b;
    }

    public static long calculateSum( long a, long b){
        return a + b;
    }
    public static double calculateSum( double a, double b){
        return a + b;
    }
}
