package ua.hillel.tatiana.elementary_homework_9;

public interface Collection {
    boolean add(String str);

    boolean addAll(String[] strArr);

    boolean addAll(Collection strColl);

    boolean delete(int index);

    boolean delete(String str);

    String get(int index);

    boolean contains(String str);

    boolean clear();

    int size();

    boolean trim();

    boolean compare(Collection coll);
}

