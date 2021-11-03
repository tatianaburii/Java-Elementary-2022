package ua.hillel.tatiana.homework11;

public class Burger {

    int meat;
    int cheese;
    int bun;
    int sauce;
    int vegetables;

    public Burger() {
    }


    public Burger(int meat, int cheese, int bun, int vegetables) {
        this.meat = meat;
        this.cheese = cheese;
        this.bun = bun;
        this.vegetables = vegetables;
        System.out.println("Diet " + this);
    }

    public Burger(int meat, int cheese, int bun, int sauce, int vegetables) {
        this.meat = meat;
        this.cheese = cheese;
        this.bun = bun;
        this.sauce = sauce;
        this.vegetables = vegetables;

        System.out.println(meat + "-Meat " + this);
    }

    @Override
    public String toString() {
        return "Burger: " + " bun - " + this.bun + ", meat - " + this.meat + ", cheese - " +
                this.cheese + ", sauce - " + this.sauce + ", vegetables - " + this.vegetables + ".";
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Burger)) {
            return false;
        }
        Burger burger = (Burger) obj;
        return this.bun == burger.bun && this.meat == burger.meat && this.cheese == burger.cheese
                && this.vegetables == burger.vegetables && this.sauce == burger.sauce;
    }


}



