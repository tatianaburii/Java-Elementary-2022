package ua.hillel.tatiana.lesson9;

public class Parking {
    public static void main(String[] args) {

        boolean[][][] parking = {{{false, false, false}, {false, false, true}, {false, false, true}},
        {{false, true, false}, {true, false, false }, {true, false, false}},
                {{false, false, false}, {true, false, false}, {false, false, true}}};

        for (int i = 0; i < parking.length; i++) {
            System.out.println("Floor" + (i + 1 ));
            for (int j = 0; j < parking[i].length; j++) {
                for (int k = 0; k < parking[i][j].length; k++) {
                    System.out.print(parking[i][j][k] + "  ");

                }
                System.out.println();

            }
            System.out.println();


        }

    }
    }
