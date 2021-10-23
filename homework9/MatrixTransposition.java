package ua.hillel.tatiana.homework9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MatrixTransposition {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Задайте кількість рядків M = :");
        int M = Integer.parseInt(reader.readLine());
        System.out.println("Задайте кількість стовбців N = :");
        int N = Integer.parseInt(reader.readLine());
        int[][] matrixOne = arrayInput(M, N);
        System.out.println("Початкова матриця:");
        printMatrix(matrixOne);
        int[][] matrixTwo = arrayTransposition(matrixOne, M, N);
        System.out.println("Транспонована матриця: ");
        printMatrix(matrixTwo);
    }
    public static int [][] arrayTransposition(int[][] matrixOne, int M, int N) {
       int[][] matrixTwo = new int[N][M];
        for (int i = 0; i < matrixTwo.length; i++) {
            for (int j = 0; j < matrixTwo[i].length; j++) {
                matrixTwo[i][j] = matrixOne[j][i];
            }
        }
        return matrixTwo;
    }

    public static int[][] arrayInput(int M, int N) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[][] matrixOne = new int[M][N];
        System.out.println("Заповніть матрицю: ");
        for (int i = 0; i < M; i++) {
            System.out.println("Кількість чисел у " + (i + 1) + " рядку: " + N);
            for (int j = 0; j < N; j++) {
                matrixOne[i][j] = Integer.parseInt(reader.readLine());
            }
        }
        return matrixOne;
    }
    public static void printMatrix(int[][] matrixOne){
        for (int i = 0; i < matrixOne.length; i++) {
            for (int j = 0; j < matrixOne[i].length; j++) {
                System.out.print(matrixOne[i][j] + " ");
            }
            System.out.println();
        }
    }

}
