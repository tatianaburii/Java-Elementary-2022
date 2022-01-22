package ua.hillel.tatiana.elementary_homework_8;

public class MyArrayListRun {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        MyArrayList myArrayList2 = new MyArrayList();
        MyArrayList myArrayList3 = new MyArrayList();

        for (int i = 1; i <= 15; i++) {
            myArrayList.add("object" + i);
            myArrayList2.add("object" + i);

        }
        //myArrayList.add(3, "one44");
        myArrayList.delete("object6");
        System.out.println(myArrayList.contain("one44"));
        myArrayList3 = myArrayList;
        System.out.println(myArrayList.equals(myArrayList2));
        System.out.println(myArrayList.equals(myArrayList3));


    }
}
