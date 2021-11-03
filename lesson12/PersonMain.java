package ua.hillel.tatiana.lesson12;

public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person("Ivan", 24);
        Person person2 = new Person("Bogdan", 24);
        if (person1.equals(person2)) {
            System.out.println("Age of persons is equals!");
        }
        System.out.println("person1 name: " + person1.getName());
        System.out.println("person1 age: " + person1.getAge());
        person1.setAge(36);
        person1.setName("old Ivan");
        System.out.println("person1 name: " + person1.getName());
        System.out.println("person1 age: " + person1.getAge());

        person1.birthDay();
        System.out.println(person1.getAge());

        person2.birthDay();
        System.out.println(person2.getAge());

        // System.out.println(person1.COUNT); - bed style

        Person.printCount();

    }


}

