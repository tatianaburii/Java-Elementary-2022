package ua.hillel.tatiana.lesson10;

public class StringTest {
    public static void main(String[] args) {
        String s1 = "Cat";
        String s2 = "Cat";
        String s3 = new String("Cat");
        if (s1.equals(s2)) {
            System.out.println("equals");
        }
        if (s1 == s2){
            System.out.println(s1 == s2);
        }
        if (s1.equals(s3)) {
            System.out.println("equals");
        }
        if (s1 == s3){
            System.out.println(s1 != s3);
        }
        System.out.println(s1.length());
    }
}
