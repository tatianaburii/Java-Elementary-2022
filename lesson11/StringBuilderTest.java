package ua.hillel.tatiana.lesson11;

public class StringBuilderTest {
    public static void main(String[] args) {
        String str = "test";
        System.out.println(str + "1" + "2");
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder
                .append("1")
                .append("2");
        System.out.println(stringBuilder);
        String newString = stringBuilder.toString();
    }
}
