package ua.hillel.tatiana.elementary_homework_3;

public class Chessboard {
    public static void main(String[] args) {
        char[][] coordinates = new char[8][8];

        for (int i = 0; i < coordinates.length; i++) {
            for (int j = 0; j < coordinates[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    coordinates[i][j] = 'B';
                } else {
                    coordinates[i][j] = 'W';
                }
                System.out.print(coordinates[i][j] + "  ");
            }
            System.out.println();

        }
    }
}
