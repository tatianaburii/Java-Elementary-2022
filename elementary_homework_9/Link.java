package ua.hillel.tatiana.elementary_homework_9;

public class Link {
    String data;
    Link next;
    Link previous;

    public Link(String str) {
        data = str;
    }

    public void displayLink() {
        System.out.println("{" + data + "}");
    }

}
