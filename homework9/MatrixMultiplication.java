package ua.hillel.tatiana.homework9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MatrixMultiplication {
    public static void main(String[] args) throws IOException  {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Вкажіть діапазон, у якому будуть числа,  min = ");
        int min = Integer.parseInt(reader.readLine());
        System.out.println("max = ");
        int max = Integer.parseInt(reader.readLine());
        System.out.println("Задайте розмір матриці M = :");
        int M = Integer.parseInt(reader.readLine());
        int[][] matrixOne = arrayRandom(M, max, min);
        System.out.println(" matrixOne:");
        printMatrix(matrixOne);
        int[][] matrixTwo = arrayRandom(M, max, min);
        System.out.println("matrixTwo:");
        printMatrix(matrixTwo);
        int[][] matrixSum = arraySum(matrixOne, matrixTwo, M );
        System.out.println("matrixSum:");
        printMatrix(matrixSum);
        int[][] matrixMultiplication = arrayMultiplication(matrixOne, matrixTwo, M);
        System.out.println("matrixMultiplication:");
        printMatrix(matrixMultiplication);


    }

    public static int[][] arrayRandom(int M, int max, int min)  {
        int[][] matrixOne = new int[M][M];
        for (int i = 0; i < matrixOne.length; i++) {
            for (int j = 0; j < matrixOne[i].length; j++) {
                matrixOne[i][j] = (int) (Math.random() * (max - min) + min);
            }
        }
        return matrixOne;
    }

    public static void printMatrix(int[][] matrixOne) {
        for (int i = 0; i < matrixOne.length; i++) {
            for (int j = 0; j < matrixOne[i].length; j++) {
                System.out.print(matrixOne[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] arraySum(int[][] matrixOne, int[][] matrixTwo, int M) {
        int[][] matrixSum = new int[M][M];
        for (int i = 0; i < matrixSum.length; i++) {
            for (int j = 0; j < matrixSum[i].length; j++) {
                matrixSum[i][j] = matrixOne[i][j] + matrixTwo[i][j];
            }
        }
        return matrixSum;
    }

    public static int[][] arrayMultiplication(int[][] matrixOne, int[][] matrixTwo, int M) {
        int[][] matrixMultiplication = new int[M][M];

        for (int i = 0; i < matrixMultiplication.length; i++) {
            for (int j = 0; j < matrixMultiplication[i].length; j++) {
                int sum = 0;
                for (int k = 0; k < matrixOne[i].length; k++) {
                    matrixMultiplication[i][j] = sum + (matrixOne[i][k] * matrixTwo[k][j]);
                    sum = sum + matrixOne[i][k] * matrixTwo[k][j];
                }
            }
        }
        return matrixMultiplication;
    }


}
