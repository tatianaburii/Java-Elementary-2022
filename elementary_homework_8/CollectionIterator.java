package ua.hillel.tatiana.elementary_homework_8;


import java.util.Iterator;

public class CollectionIterator implements Iterator {
    private MyArrayList myArrayList;
    private int count = 0;

    @Override
    public boolean hasNext() {
        return count < myArrayList.size();
    }

    @Override
    public Object next() {
        if (hasNext()){
            return myArrayList.get(count++);
        }
        return null;
    }
    public CollectionIterator(MyArrayList myArrayList){
        this.myArrayList = myArrayList;
    }

}
