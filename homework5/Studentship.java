package ua.hillel.tatiana.homework5;
        import java.util.Scanner;
public class Studentship {
    public static void main(String[] args) {
        float serbal;
        Scanner in = new Scanner(System.in);

        System.out.println("Для того, щоб розрахувати стипендію на наступний семестр, введіть дані:");

        System.out.println("Який бал ви отримали з алгебри? :");
        Byte algebra = in.nextByte();

        if (algebra > 10 || algebra <1) {
            System.out.println("Дані введено некоректно!Результат буду з помилкою!");
        }

        System.out.println("Який бал ви отримали з геометрії?:");
        Byte geometry = in.nextByte();

        if (geometry > 10 || geometry < 1) {
            System.out.println("Дані введено некоректно! Результат буду з помилкою!");
        }

        System.out.println("Який бал ви отримали з механіки?:");
        Byte mechanics = in.nextByte();

        if (mechanics > 10 || mechanics < 1){
            System.out.println("Дані введено некоректно! Результат буду з помилкою!");
        }

        System.out.println("Який бал ви отримали з психології?:");
        Byte psyhology = in.nextByte();

        if (psyhology > 10 || psyhology < 1) {
            System.out.println("Дані введено некоректно! Результат буду з помилкою!");
        }

        System.out.println("Який бал ви отримали з історії?:");
        Byte history = in.nextByte();

        if (history > 10 || history < 1) {
            System.out.println("Дані введено некоректно! Результат буду з помилкою!");
        }


        serbal = (float) (algebra + geometry + mechanics + psyhology + history) / 5;


        if (serbal == 10) {
            System.out.println(serbal + " Вітаю! Ви круто попрацювали і отримаєту стипендію у підвищеному розмірі! ");
        } else if (serbal >= 8 && serbal < 10) {
            System.out.println(serbal + " У вас гарні успіхи - так тримати! Очікуйте начислення!");
        } else {
            System.out.println(serbal + " Вам варто більше часу приділяти навчанню. " +
                    "Грошових виплат у цьому семестрі не буде. Куратор вже телефонує вашій мамі!");
        }


    }





}


