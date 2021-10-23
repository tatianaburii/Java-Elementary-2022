package ua.hillel.tatiana.homework7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Rugby2 {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введіть кількість членів команд:");
        int size = Integer.parseInt(reader.readLine());

        int[] team1 = new int [size];
        int[] team2 = new int [size];

        for (int i = 0; i < size; i++) {
            team1[i] = (int) (Math.random() * (70 -14) + 14 );
            team2[i] = (int) (Math.random() * (70 - 14) + 14);

        }
        System.out.print("Вік членів команди 1:" + Arrays.toString(team1));
        System.out.println();
        System.out.println("Вік членів команди 2:" + Arrays.toString(team2));

        double average1 = 0;
        double average2 = 0;

        for (int i = 0; i < size; i++) {
            average1 += team1[i];
            average2 += team2[i];
        }
        System.out.println("Середній вік першої команди " + "  " + average1/size);
        System.out.println("Середній вік другої команди" + "  " + average2/size);
        if (average1 > average2) {
            System.out.println( "Середній вік першої команди більший!");
        }else if (average1 < average2) {
            System.out.println("Середній вік другої команди більший!");
        }else {
            System.out.println("Середній вік команд однаковий!");
        }

    }


}
