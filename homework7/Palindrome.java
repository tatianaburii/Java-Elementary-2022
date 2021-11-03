package ua.hillel.tatiana.homework7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Palindrome {
    public static void main(String[] args) throws IOException {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введіть рядок:");
        String s = reader.readLine();
        if (isPalindrome(s)) {
            System.out.println("Так, це паліндром!");
        } else {
            System.out.println("Ні, це не паліндром!");
        }
    }

    public static boolean isPalindrome(String s) {
        int i, j;
        for (i = 0, j = s.length() - 1; i < j; i++, j-- ) {
                while (i < j && !(Character.isLetterOrDigit(s.charAt(i)))) {
                    i++;
                }
                while (i < j && !(Character.isLetterOrDigit(s.charAt(j)))) {
                    j--;
                }
                if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                    return false;
                }
        }
        return true;
    }
}