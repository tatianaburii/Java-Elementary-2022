package ua.hillel.tatiana.homework6;

import java.util.Scanner;

public class UnluckyNumbers2 {
    public static void main(String[] args) {
        int ost, wp, ost2, wp2, wp3, ost3, wp4, ost4;
        //ost - залишок від ділення на 10;
        // wp - ціла частина;

        Scanner scanner = new Scanner(System.in);
        System.out.println("До якого числа будемо виводити (у діапазоні 100 000)?");
        int numnber = scanner.nextInt();

        for (int i = 0; i < numnber; i++) {
            ost = i % 10;
            wp = i / 10;

            if (i == 9 || i == 4 || ost == 9 || wp == 4 || ost == 4 || wp == 9 ) {
                continue;
            }

            else if (wp > 10) {
                wp2 = wp / 10;
                ost2 = wp % 10;

                if (wp2 == 4 || wp2 == 9 || ost2 == 4 || ost2 == 9) {
                    continue;}

            else if ( wp2 > 10 ) {
                wp3 = wp2 / 10;
                ost3 = wp2 % 10;
                if ( wp3 == 4 || wp3 == 9 || ost3 == 4|| ost3 == 9) {
                    continue;
                }
            else if (wp3 > 10) {
                wp4 = wp3 / 10;
                ost4 = wp3 % 10;
                if (wp4 == 4 || wp4 ==9 || ost4 == 4 || ost4 == 9) {
                    continue;}
                }}
                }



            System.out.println(i);

            }
    }
}





