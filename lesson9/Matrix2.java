package ua.hillel.tatiana.lesson9;

public class Matrix2 {
    public static void main(String[] args) {
        int[][] coordinates = new int[2][3];

        for (int i = 0; i < coordinates.length; i++) {
            for (int j = 0; j < coordinates[i].length; j++) {
                coordinates[i][j] = (int) (Math.random() * 9);
                System.out.print(coordinates[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int[][] matrix = new int[3][2];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = coordinates[j][i];
                System.out.print(matrix [i][j] + " ");
            }
            System.out.println();

        }


    }
}

