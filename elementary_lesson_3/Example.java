package ua.hillel.tatiana.elementary_lesson_3;

public class Example {
    public static void main(String[] args) {
        int x = 0;
        while (x++ < 10) {
            System.out.println(x);
        }

        String message = x > 10 ? "Grather than" : String.valueOf(false);
        System.out.println(message + "," + x);

    }
}
