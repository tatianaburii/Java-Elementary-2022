package ua.hillel.tatiana.lesson12;

public class Person {
    public static int COUNT;
    private int age;
    private String name;

    public Person() {
        ++COUNT;
    }

    public Person(String name) {
        this.name = name;
        ++COUNT;
        System.out.println(this);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        ++COUNT;
        System.out.println(this);

    }

    public String toString() {
        return "Person: name - " + this.name + " age - " + this.age;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Person)) {
            return false;
        }
        Person person = (Person) obj;
        return this.age == person.age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void birthDay() {
        this.age += 1;
        System.out.println("Happy birthday!!!");
    }

    public static void printCount() {

        System.out.println("persons: " + COUNT);
    }


}
