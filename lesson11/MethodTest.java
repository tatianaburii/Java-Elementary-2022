package ua.hillel.tatiana.lesson11;

public class MethodTest {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("number in main" + n);

        System.out.println(n);


    }

    public static void testObject(Dog dog) {
        System.out.println("dog i method: " + dog.name);
        dog.name = dog.name + " new" ;
        System.out.println("dog after method: " + dog.name);
    }
}
