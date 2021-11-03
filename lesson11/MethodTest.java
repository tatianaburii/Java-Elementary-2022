package ua.hillel.tatiana.lesson11;

public class MethodTest {

    public static void main(String[] args) {

        int n = 10;

        System.out.println("number in main " + n);

        testPrimitive(n);

        System.out.println("number in main after method call " + n);

        DogOne dog = new DogOne();
        dog.setName("Ted");

        System.out.println("dog in main " + dog.getName());
        testObject(dog);
        System.out.println("number in main after method call " + dog.getName());


    }

    public static void testPrimitive(int number) {
        number *= 2;
        System.out.println("number in method after modification " + number);

    }

    public static void testObject(DogOne dog) {
        System.out.println("dog in method " + dog.getName());
        dog.setName(dog.getName() + " new");
        System.out.println("dog name after modification");

    }


}

