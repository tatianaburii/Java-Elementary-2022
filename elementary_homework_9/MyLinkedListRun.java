package ua.hillel.tatiana.elementary_homework_9;


import java.lang.reflect.Method;

public class MyLinkedListRun {

    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();
        MyLinkedList list2 = new MyLinkedList();
        for (int i = 0; i < 10; i++) {
            list.add("number_" + i);
            list2.add(i + "_number");

        }
        String[] strings = {"string_1", "string_2", "string_3", "string_4"};
        MyLinkedList list3 = new MyLinkedList();


//        System.out.println(list.compare(list2));
//        System.out.println(list.compare(list3));
//        System.out.println(list.delete("number_0"));
//        System.out.println(list.contains("number_3"));
//        System.out.println(list.add("number_10"));
//        System.out.println(list.size);
//        System.out.println(list.addAll(strings));
//        System.out.println(list.addAll(list2));
//        System.out.println(list.get(15));
//        System.out.println(list.delete(13));
//        list.printMyLinkList();
//        System.out.println(list);
//        System.out.println(list.clear());


    }

}
