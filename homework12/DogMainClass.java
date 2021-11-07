package ua.hillel.tatiana.homework12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class DogMainClass {
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        ArrayList<Dog> dogs = createDog();
        compare(dogs);
        Dog.printCount();

    }


    private static ArrayList<Dog> createDog() throws IOException {
        System.out.println("How many dogs are you going to create?");
        int number = Integer.parseInt(reader.readLine());
        String name;
        String bread;
        int weight;
        int age;
        ArrayList<Dog> dogs = new ArrayList<>();

        for (int i = 0; i < number; i++) {

            System.out.println("Input dog" + (i + 1) + " name: ");
            name = reader.readLine();

            System.out.println("Input dog" + (i + 1) + " bread: ");
            bread = reader.readLine();

            System.out.println("Input dog" + (i + 1) + " weight: ");
            weight = Integer.parseInt(reader.readLine());

            System.out.println("Input dog" + (i + 1) + " age: ");
            age = Integer.parseInt(reader.readLine());

            Dog dog = new Dog(name, bread, weight, age);
            dogs.add(dog);
        }

        return dogs;
    }

    public static void compare(ArrayList<Dog> dogs) {
        for (int i = 0; i < dogs.size() - 1; i++)
            for (int j = dogs.size() - 1; j > i; j--) {

                if (dogs.get(i) == dogs.get(j)) {
                    System.out.println("Links dog" + (i + 1) + " and dog" + (j + 1) + " are equal!");
                }
                if (dogs.get(i).equals(dogs.get(j))) {
                    System.out.println("Values dog" + (i + 1) + " and dog" + (j + 1) + " are equal!");
                }
            }
    }
}
