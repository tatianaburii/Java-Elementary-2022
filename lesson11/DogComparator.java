package ua.hillel.tatiana.lesson11;

public class DogComparator {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Knopa");
        Dog dog2 = dog1;
        Dog dog3 = new Dog("Nitshe", 20);
        Dog dog4 = new Dog("Knopa");
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println(dog4);

        if (dog1 == dog2){
            System.out.println("Link is equal");
        }
        if (dog1.equals(dog2)) {
            System.out.println("Values are equal");
        }
        if (dog1 == dog3){
            System.out.println("Link is equal");
        }
        if (dog1.equals(dog3)) {
            System.out.println("Values are equal");
        }
    }
}
