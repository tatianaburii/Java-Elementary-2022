package ua.hillel.tatiana.lesson11;

public class DogOne {


    private String name;
    private int age;

    public DogOne() {

        System.out.println("dog is created");
    }

    public DogOne(String name) {

        this.name = name;
    }

    public DogOne(String name, int age) {
    }

    public void run() {

        System.out.println(this.name + " is running");
    }

    @Override
    public String toString() {
        return "Dog: name = " + this.name + ", age " + this.age;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof DogOne)) {
            return false;
        }
        DogOne dog = (DogOne) obj;
        return this.name.equals(dog.name) && this.age == dog.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }


}
