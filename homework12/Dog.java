package ua.hillel.tatiana.homework12;

public class Dog {

    public static int COUNT;
    private String name;
    private String breed;
    private int weight;
    private int age;


    public Dog(String name, String breed, int weight, int age) {
        this.name = name;
        this.breed = breed;
        this.weight = weight;
        this.age = age;
        ++COUNT;
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Dog: name - " + this.name + ", breed - " + this.breed + ", weight - "
                + this.weight + " age - " + this.age;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Dog)) {
            return false;
        }
        Dog dog = (Dog) obj;
        return this.age == dog.age && this.weight == dog.weight;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void printCount() {
        System.out.println("Dog population in the program: " + COUNT);
    }


}
