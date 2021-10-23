package ua.hillel.tatiana.lesson10;

public class Recurcion {
    public static void main(String[] args) {

        recurcion(0);
    }
    public static void recurcion( int count) {
        System.out.println("Hello" + ++count);
        if (count > 100) {
            return;
        }
        recurcion(count);
    }
}
