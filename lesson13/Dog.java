package ua.hillel.tatiana.lesson13;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(name + "says gav-gav");
    }
}
