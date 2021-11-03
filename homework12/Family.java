package ua.hillel.tatiana.homework12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Family {
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        Human child = createChildWithParents();

        child.printFamily();
    }



    public static Human createHuman() throws IOException {
        System.out.println("Input parent's name: ");
        String name = reader.readLine();
        return new Human(name);
    }

    public static Human createChildWithParents() throws IOException {
        System.out.println("Input child's name: ");
        String name = reader.readLine();
        return new Human(name, createHuman(), createHuman());
    }




}
