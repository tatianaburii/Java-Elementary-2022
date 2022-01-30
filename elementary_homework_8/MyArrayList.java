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
            Object[] myArrayList1 = new Object[new_size];
            System.arraycopy(myArrayList, 0, myArrayList1, 0, myArrayList.length);
            myArrayList = myArrayList1;
        }
    }

    public boolean add(int index, Object obj) {
        checkAndChangeSize();
        if (index > count) {
            index = count;
        }
        if (count + 1 - index >= 0) {
            System.arraycopy(myArrayList, index, myArrayList, index + 1, count + 1 - index);
        }
        myArrayList[index] = obj;
        count++;
        return true;

    }

    public boolean clear() {
        myArrayList = new MyArrayList[10];
        this.count = 0;
        return true;
    }

    public int size() {
        return count;
    }

    public void delete(int index) {
        if (index >= myArrayList.length) {
            System.out.println("no index");
        } else {
            if (count - index >= 0) {
                System.arraycopy(myArrayList, index + 1, myArrayList, index, count - index);
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
        for (int i = 0; i < count; i++) {
            if (o.equals(myArrayList[i])) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Collection str) {
        if (str == this) {
            return true;
        }
        if (this.getClass() != str.getClass()) {
            return false;
        }
        MyArrayList list = (MyArrayList) str;
        return this.count == list.count && Arrays.equals(this.myArrayList, list.myArrayList);
    }

}
