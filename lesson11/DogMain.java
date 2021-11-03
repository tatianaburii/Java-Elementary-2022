package ua.hillel.tatiana.lesson11;

public class DogMain {

    public static void main(String[] args) {
        DogOne dog = new DogOne();
        dog.run();

        System.out.println(dog.getName());
        System.out.println(dog.getAge());

        dog.setName("Bobik");
        dog.setAge(3);

        System.out.println(dog.getAge());
        System.out.println(dog.getName());
        DogOne dog2 = dog;

        System.out.println(dog);
        System.out.println(dog2);

        DogOne dog3 = new DogOne();

        System.out.println(dog3);

        dog2.setName("Sharik");

        System.out.println("dog name:" + dog.getName());
        System.out.println("dog2 name:" + dog2.getName());


    }
}
