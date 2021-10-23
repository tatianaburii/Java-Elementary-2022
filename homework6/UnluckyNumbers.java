package ua.hillel.tatiana.homework6;


public class UnluckyNumbers {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            if (i == 9 || i == 4 || i % 10 == 4 || i % 10 == 9 || i / 10 == 4 || i / 10 == 9) {
                continue;
            }
            System.out.println(i);
        }

    }
}