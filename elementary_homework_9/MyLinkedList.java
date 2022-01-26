package ua.hillel.tatiana.elementary_homework_9;

public class MyLinkedList implements Collection, Printable {
    private Link first;
    private Link last;
    int size;

    public MyLinkedList() {
        first = null;
        last = null;
        size = 0;
    }

    @Override
    public boolean add(String str) {    // to add items to the end of collection
        Link newLink = new Link(str);
        if (size != 0) {
            this.last.next = newLink;
            newLink.previous = this.last;
            this.last = newLink;
        } else {
            last = new Link(str);
            first = last;
        }
        size++;
        return true;
    }

    @Override
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
        return true;
    }

    @Override
    public boolean delete(int index) {
        if (index == 0) {
            Link link = this.first;
            this.first = link.next;
            this.first.previous = null;
            link.next = null;
            link.data = null;

        } else if (index == size - 1) {
            Link link = this.last;
            this.last = link.previous;
            this.last.next = null;
            link.previous = null;
            link.data = null;

        } else {
            Link link = this.first;
            for (int i = 0; i < index; i++) {
                link = link.next;
            }
            link.previous.next = link.next;
            link.next.previous = link.previous;
        }
        size--;
        return true;
    }


    @Override
    public boolean delete(String str) {
        Link link = this.first;
        for (int i = 0; i < size; i++) {
            if (link.data.equals(str)) {
                this.delete(i);
                return true;
            }
            link = link.next;
        }

        return false;

    }

    @Override
    public String get(int index) {
        if (index > size) {
            return "no index";
        }
        Link link = this.first;
        for (int i = 0; i < index; i++) {
            link = link.next;
        }
        return link.data;
    }

    @Override
    public boolean contains(String str) {
        Link current = first;
        for (int i = 0; i < size; i++) {
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
        last = null;
        size = 0;
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean compare(Collection coll) {
        if (this == coll) {
            return true;
        }
        if (this.size != coll.size()) {
            return false;
        }
        for (int i = 0; i < coll.size(); i++) {
            if (!this.get(i).equals(coll.get(i))) {
                return false;
            }
        }

        return true;
    }

    @Override
    public boolean trim() {
        return false;
    }

    @Override
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
