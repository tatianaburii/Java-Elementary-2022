package ua.hillel.tatiana.elementary_homework_9;


public class MyLinkedListRun {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        MyLinkedList list2 = new MyLinkedList();
        for (int i = 0; i < 5; i++) {
            list.add("number_" + i);
            list2.add(i + "_number");

        }
        MyLinkedList list3 = list;
        System.out.println(list.compare(list2));
        System.out.println(list.compare(list3));


    }
}
