package ua.hillel.tatiana.elementary_homework_9;

public class MyLinkedList implements Collection {
    private Link first;
    private Link current;
    int size;

    public MyLinkedList() {
        first = null;
        current = null;
        size = 0;
    }

    @Override
    public boolean add(String str) {    // to add items to the end of collection
        if (str == null) {
            throw new NullPointerException("argument is null");
        }
        if (!isEmpty()) {
            Link previous = current;
            current = new Link(str);
            previous.next = current;
        } else {
            current = new Link(str);
            first = current;
        }
        size++;
        return false;
    }

    public boolean addAll(Collection strColl) {
        for (int i = 0; i < strColl.size(); i++) {
            add(strColl.get(i));
        }

        return true;
    }

    @Override
    public boolean addAll(String[] strArr) {
        for (String str : strArr) {
            add(str);
        }
        return false;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean delete(int index) {
        Link current = first;
        Link previous = first;
        int i = 0;
        while (i != index) {
            i++;
            if (current.next == null) {
                return false;
            } else {
                previous = current;
                current = current.next;
            }
        }
        if (current == first) {
            first = first.next;
        } else {
            previous.next = current.next;
        }
        size--;
        return true;
    }

    @Override
    public boolean delete(String str) {
        Link current = first;
        Link previous = first;
        while (!(current.data.equals(str))) {
            if (current.next == null) {
                return false;
            } else {
                previous = current;
                current = current.next;
            }
        }
        if (current == first) {
            first = first.next;
        } else {
            previous.next = current.next;
        }
        size--;
        return true;

    }

    @Override
    public String get(int index) {
        Link current = first;
        int i = 0;
        while (current != null) {
            if (i == index) {
                return current.data;
            }
            i++;
            current = current.next;
        }
        return "no index";
    }

    @Override
    public boolean contains(String str) {
        Link current = first;
        while (current != null) {
            if (current.data.equals(str)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public boolean clear() {
        first = null;
        current = null;
        size = 0;
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    public boolean compare(Collection coll) {
        if (this == coll) {
            return true;
        }
        if (this.size != coll.size()) {
            return false;
        }
        for (int i = 0; i < coll.size(); i++) {
            if(!this.get(i).equals(coll.get(i))) {
                return false;
            }
        }

        return true;
    }

    @Override
    public boolean trim() {
        return false;
    }

    public void printMyLinkList() {
        System.out.println(" List (first --> last): ");
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println(" ");
    }




}
