package ua.hillel.tatiana.homework9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MatrixSum {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Вкажіть діапазон, у якому будуть числа,  min = ");
        int min = Integer.parseInt(reader.readLine());
        System.out.println("max = ");
        int max = Integer.parseInt(reader.readLine());

        System.out.println("Задайте розмір M = :");
        int M = Integer.parseInt(reader.readLine());
        System.out.println("Задайте розмір N = :");
        int N = Integer.parseInt(reader.readLine());
        System.out.println("Задайте розмір R = :");
        int R = Integer.parseInt(reader.readLine());

        System.out.println("matrixOne:");
        int[][][] matrixOne = arrayRandom(M, N, R, min, max);
        printMatrix(matrixOne);

        System.out.println("matrixTwo: ");
        int[][][] matrixTwo = arrayRandom(M, N, R, min, max);
        printMatrix(matrixTwo);

        System.out.println("matrixSum: ");
        int[][][] matrixSum = arraySum(matrixOne, matrixTwo, N, M, R );
        printMatrix(matrixSum);


    }

    public static int[][][] arrayRandom(int M, int N, int R, int max, int min) {
        int[][][] matrixOne = new int[M][N][R];
        for (int i = 0; i < matrixOne.length; i++) {
            for (int j = 0; j < matrixOne[i].length; j++) {
                for (int k = 0; k < matrixOne[i][j].length; k++) {
                    matrixOne[i][j][k] = (int) (Math.random() * (max - min) + min);
                }
            }
        }
        return matrixOne;
    }

    public static void printMatrix(int[][][] matrixOne) {
        for (int i = 0; i < matrixOne.length; i++) {
            for (int j = 0; j < matrixOne[i].length; j++) {
                for (int k = 0; k < matrixOne[i][j].length; k++) {
                    System.out.print(matrixOne[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static int[][][] arraySum(int[][][] matrixOne, int[][][] matrixTwo, int M, int N, int R) {
        int[][][] matrixSum = new int[M][N][R];
        for (int i = 0; i < matrixSum.length; i++) {
            for (int j = 0; j < matrixSum[i].length; j++) {
                for (int k = 0; k < matrixSum[i][j].length; k++) {
                    matrixSum[i][j][k] = matrixOne[i][j][k] + matrixTwo[i][j][k];
                }
            }
        }
        return matrixSum;
    }




}
