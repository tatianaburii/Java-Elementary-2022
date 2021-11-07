package ua.hillel.tatiana.lesson13;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PetStore {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Animal> animals = new ArrayList<>();

        String input;
        while (!(input = reader.readLine()).equals("exit")) {
            Animal animal;
            String name;
            switch (input) {
                case "cat":
                    System.out.println("input cat name: ");
                    name = reader.readLine();
                    animal = new Cat(name);
                    animals.add(animal);
                    break;
                case "dog":
                    System.out.println("input dog name: ");
                    name = reader.readLine();
                    animal = new Dog(name);
                    animals.add(animal);
                    break;
                case "parrot":
                    System.out.println("input parrot name: ");
                    name = reader.readLine();
                    animal = new Parrot(name);
                    animals.add(animal);
                    break;
                default:
                    System.out.println("Unknown animal type!");
            }
        }

        for (Animal animal1 : animals) {
            animal1.speak();
        }

    }

}

