package ua.hillel.tatiana.lesson6;

public class Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if ( i%5==0 ) {
                continue;
            }
            System.out.println(i);
            }

        }
    }

