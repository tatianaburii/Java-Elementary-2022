package ua.hillel.tatiana.elementary_homework_8;
import java.util.Arrays;

public class MyArrayList implements Collection {
    private int count;
    private Object[] myArrayList;

    public MyArrayList() {
        myArrayList = new Object[10];
        count = 0;
    }

    public boolean add(Object obj) {
        checkAndChangeSize();
        myArrayList[count++] = obj;
        return true;
    }

    private void checkAndChangeSize() {
        if (myArrayList.length < count + 2) {
            int new_size = myArrayList.length * 2;
            String[] myArrayList1 = new String[new_size];
            System.arraycopy(myArrayList, 0, myArrayList1, 0, myArrayList.length);
            myArrayList = myArrayList1;
        }
    }

    public boolean add(int index, Object obj) {
        checkAndChangeSize();
        if (index > count) {
            index = count;
        }
        for (int i = count; i >= index; i--) {
            myArrayList[i + 1] = myArrayList[i];
        }
        myArrayList[index] = obj;
        count++;
        return true;

    }

    public void delete(int index) {
        if (index >= myArrayList.length) {
            System.out.println("no index");
        } else {
            for (int i = index; i < count; i++) {
                myArrayList[i] = myArrayList[i + 1];
            }
            count--;
        }
    }

    public boolean delete(Object obj) {
        int flag = 0;
        for (int i = 0; i <= count; i++) {
            if (myArrayList[i].equals(obj)) {
                flag = i;
                break;
            }
        }
        delete(flag);
        return true;
    }

    public void print() {
        for (Object obj : myArrayList) {
            System.out.println(obj);
        }
    }

    public Object get(int index) {
        if (index > count) {
            return "no index";
        }
        return myArrayList[index];
    }

    public boolean contain(Object o) {
        for (Object obj : myArrayList) {
            if (obj.equals(o)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Collection str) {

        if (str == null || getClass() != str.getClass()) {
            return false;
        }
        MyArrayList myArrayList1 = (MyArrayList) str;
        if (count != myArrayList1.count) {
            return false;
        }
        if (!(Arrays.equals(myArrayList, myArrayList1.myArrayList))) {
            return false;
        }
        return true;
    }

    public boolean clear() {
        myArrayList = new MyArrayList[10];
        return true;
    }

    public int size() {
        return count;
    }

}
