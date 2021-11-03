package ua.hillel.tatiana.homework12;


public class DogMainClass {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Laima", "hound", 6, 3);
        Dog dog2 = new Dog("Juice", "pug", 6, 3);
        Dog dog3 = new Dog("Rouse", "chihuahua", 1, 1);

        compare(dog1, dog2, "dog 1 == dog2: Links are equal", "dog1.equals(dog2): Values are equal");
        compare(dog1, dog3, "dog 1 == dog3: Links are equal", "dog1.equals(dog3): Values are equal");
        compare(dog3, dog2, "dog3  == dog2: Links are equal", "dog3.equals(dog2): Values are equal");

        Dog.printCount();

    }

    private static void compare(Dog dog1, Dog dog2, String s, String s2) {
        if (dog1 == dog2) {
            System.out.println(s);
        }
        if (dog1.equals(dog2)) {
            System.out.println(s2);
        }
    }
}
