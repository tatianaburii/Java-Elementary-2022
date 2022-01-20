package ua.hillel.tatiana.elementary_homework_7;

import java.io.IOException;

public class MListRun {
    public static void main(String[] args) throws IOException {
        MyList myList = new MyList();
        for (int i = 0; i < 20; i++) {
            myList.add("one" + i);
        }
        myList.add(20, "he-ne");
        myList.delete(3);
        myList.delete("one4");
        myList.add("not null");
        System.out.println(myList.get(18));
        myList.print();
    }


}
