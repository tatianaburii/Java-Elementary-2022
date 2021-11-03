package ua.hillel.tatiana.lesson11;

public class DogComparator {
    public static void main(String[] args) {
        DogOne dog1 = new DogOne("Knopa");
        DogOne dog2 = dog1;
        DogOne dog3 = new DogOne("Nitshe", 20);
        DogOne dog4 = new DogOne("Knopa");

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println(dog4);

        compare(dog1, dog2, "dog 1 == dog2: Links are equal", "dog1.equals(dog2): Values are equal");
        compare(dog1, dog3, "dog 1 == dog2: Links are equal", "dog1.equals(dog3): Values are equal");
        compare(dog1, dog2, "dog 1 == dog4: Links are equal", "dog1.equals(dog4): Values are equal");
    }

    private static void compare(DogOne dog1, DogOne dog2, String s, String s2) {
        if (dog1 == dog2) {
            System.out.println(s);
        }
        if (dog1.equals(dog2)) {
            System.out.println(s2);
        }
    }
}
