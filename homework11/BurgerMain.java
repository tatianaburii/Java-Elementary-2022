package ua.hillel.tatiana.homework11;

public class BurgerMain {
    public static void main(String[] args) {
        Burger burger1 = new Burger(1, 1, 1, 1, 1);
        Burger burger2 = new Burger(2, 1, 1, 1, 1);
        Burger burger3 = new Burger(1, 1, 1, 1);

        Burger burger4 = new Burger();

        burger4.meat = 2;
        burger4.bun = 1;

        System.out.println(burger4);

        //equal test
        Burger burger5 = burger1;

        compare(burger1, burger2, "burger1 == burger2: Links are equal", "burger1.equals(burger2): Values are equal");
        compare(burger1, burger3, "burger1 == burger3: Links are equal", "burger1.equals(burger3): Values are equal");
        compare(burger3, burger2, "burger3 == burger2: Links are equal", "burger3.equals(burger2): Values are equal");
        compare(burger1, burger5, "burger1 == burger5: Links are equal", "burger1.equals(burger5): Values are equal");
    }

    private static void compare(Burger burger1, Burger burger2, String s, String s2) {
        if (burger1 == burger2) {
            System.out.println(s);
        }
        if (burger1.equals(burger2)) {
            System.out.println(s2);
        }
    }
}

