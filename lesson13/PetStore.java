package ua.hillel.tatiana.lesson13;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PetStore {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Animal animal = new Animal("unknown");

        Cat cat = new Cat("Pixel");

        Dog dog = new Dog("Ted");

        Parrot parrot = new Parrot("Byte");


        ArrayList <Animal> animals = new ArrayList<>();
        animals.add(animal);
        animals.add(cat);
        animals.add(dog);
        animals.add(parrot);
        String input;
        while (!(input = BufferedReader.readLine()).equels("exit")) {

        }
        for (Animal animal1: animals) {
            animal1.speak();
        }

        }

    }

