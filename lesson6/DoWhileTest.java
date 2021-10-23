package ua.hillel.tatiana.lesson6;

public class DoWhileTest {
    public static void main(String[] args) {
        int a = 10;
        do {
            if ( a == 3){
            break;}
            System.out.println("Bomba boom " + a + " sek");
            a--;
        }
        while (a > 0);
        if (a >3) {
            System.out.println("Boom!");
        }

    }
}

