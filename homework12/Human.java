package ua.hillel.tatiana.homework12;

public class Human {

    private String name;
    private Human father;
    private Human mother;

    public Human(String name, Human father, Human mother) {
        this.name = name;
        this.father = father;
        this.mother = mother;
        System.out.println(this);
    }

    public Human(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Human: name - " + this.name + ", father - "
                + this.father + ", mother - " + this.mother;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printFamily() {
        System.out.println(this);
    }

}
