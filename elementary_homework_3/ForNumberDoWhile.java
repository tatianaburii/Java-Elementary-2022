package ua.hillel.tatiana.elementary_homework_3;

public class ForNumberDoWhile {
    public static void main(String[] args) {
        int n = 1;
        do {
            if (n % 2 != 0)
                System.out.println(n);
            n++;

        }while (n <= 99);
    }
}
