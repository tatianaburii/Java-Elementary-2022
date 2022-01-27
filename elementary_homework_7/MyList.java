package ua.hillel.tatiana.elementary_homework_7;

import java.util.Arrays;

public class MyList {
    private int count;
    private String[] myList;


    public MyList() {
        this.myList = new String[10];
        count = 0;
    }

    public void add(String s) {
        checkAndChangeSize();
        myList[count++] = s;
    }

    public void add(int index, String s) {
        checkAndChangeSize();
        if (index > count) {
            index = count;
        }
        for (int i = count; i >= index; i--) {
            myList[i + 1] = myList[i];
        }
        myList[index] = s;
        count++;

    }

    public void delete(int index) {
        if (index >= myList.length) {
            System.out.println("no index");
        }else {
        for (int i = index; i < count; i++) {
            myList[i] = myList[i + 1];
        }
        count--;}
    }

    public void delete(String s) {
        int flag = 0;
        for (int i = 0; i <= count; i++) {
            if (myList[i].equals(s)) {
                flag = i;
                break;
            }
        }
        delete(flag);
    }

    private void checkAndChangeSize() {
        if (myList.length < count + 2) {
            int new_size = myList.length * 2;
            String[] myList1 = new String[new_size];
            System.arraycopy(myList, 0, myList1, 0, myList.length);
            myList = myList1;
        }
    }

    public void print() {
        for (Object obj : myList) {
            System.out.println(obj);
        }
    }
    public String get(int index) {
        if (index > count) {
           return  "no index";
        }
        return myList[index];
    }

    @Override
    public String toString() {
        return "MyList{" +
                ", count=" + count +
                ", myList=" + Arrays.toString(myList) +
                '}';
    }

    public int getCount() {
        return count;
   }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyList myList1 = (MyList) o;
        return count == myList1.count && Arrays.equals(myList, myList1.myList);
    }


}



