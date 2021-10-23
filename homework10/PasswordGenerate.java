package ua.hillel.tatiana.homework10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PasswordGenerate {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please, input a password's size: ");
        int size = Integer.parseInt(reader.readLine());
        String result = passwordGeneration(size);
        System.out.println("Your new password: " + result);
    }

    public static String passwordGeneration(int size) {
        String symbol = "_qwertyuiopasdfghjklzxcvbnm";
        String digit = "0123456789";
        String password = "";
        for (int i = 0; i < size - 2; i++) {
            password = password + randomCharacter(symbol);
        }
        String randomSymbols = randomCharacter(symbol.toUpperCase());
        password = toInsertRandom(password, randomSymbols);

        String randomDigit = randomCharacter(digit);
        password = toInsertRandom(password, randomDigit);

        return password;
    }

    public static String randomCharacter(String character) {
        int c = character.length();
        int number = (int) (Math.random() * c);
        return character.substring(number, number + 1);
    }


    public static String toInsertRandom(String str, String toInsert) {
        int c = str.length();
        int number = (int) (Math.random() * (c + 1));
        return str.substring(0, number) + toInsert + str.substring(number);

    }


}
