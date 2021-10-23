package ua.hillel.tatiana.lesson11;

public class DogMain {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.run();

        System.out.println(dog.name);
        System.out.println(dog.age);

        dog.name = "Bobik";
        dog.age = 3;

        System.out.println(dog.name);
        System.out.println(dog.age);
        Dog dog1 = dog;
        System.out.println(dog);
        System.out.println(dog1);

        Dog dog2 = new Dog();
        System.out.println(dog2);
        dog1.name = "Sharik";
        System.out.println(dog1.name);
        System.out.println(dog.name);


    }
}
