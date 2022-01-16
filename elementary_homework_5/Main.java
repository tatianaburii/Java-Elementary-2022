package ua.hillel.tatiana.elementary_homework_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //System.out.println("Input number of students:");


        /*
        * Создать класс, спецификация которого приведена ниже. Определить конструкторы и методы setТип(),
        * getТип(), toString(). Определить дополнительно методы в классе, создающем массив объектов.
        * Задать критерий выбора данных и вывести эти данные на консоль. В каждом классе, обладающем информацией,
        * должно быть объявлено несколько конструкторов.

        *Student: id, Фамилия, Имя, Отчество, Год рождения, Адрес, Телефон, Факультет, Курс, Группа.

        *Создать массив из 10 объектов.
        * a) список студентов заданного факультета; - Факульет
        *b) списки студентов для каждого факультета и курса; - Факультет, Группа
        *c) список студентов, родившихся после заданного года; - Год рождения
        *d) список учебной группы. - Группа
        **/


        //Створила 10 студентів, але залишила варіант створення через консоль
        Student[] students = new Student[10];

        students[0] = new Student("Savka", "Savvatii", "Alexandrovich", 2003,
                "Odessa", "1234", "Biology", 3, "311-b");

        students[1] = new Student("Ivanov", "Ivan", "Ivanovych", 2000,
                "Odessa", "1234", "Psychology", 5, "511-p");
        students[2] = new Student("Petrov", "Petro", "Petrovich", 2001,
                "Lviv", "1534", "Biology", 4, "412-b");
        students[3] = new Student("Vasiliev", "Vasil", "Vasilivich", 2003,
                "Odessa", "1443", "Physics", 1, "111-ph");
        students[4] = new Student("Andreiev", "Andrei", "Andreievach", 2004,
                "Kalush", "1284", "Psychology", 1, "111-p");
        students[5] = new Student("Olenchuk", "Olena", "Olegivna", 2002,
                "Kiev", "1984", "Psychology", 3, "311-p");
        students[6] = new Student("Alexandrov", "Alexandr", "Alexandrovich", 2005,
                "Ivano-Frankivsk", "4284", "Physics", 1, "111-ph");
        students[7] = new Student("Zakharov", "Ivan", "Ivanovych", 2000,
                "Odessa", "1234", "Astronomy", 5, "511-a");
        students[8] = new Student("Melnyk", "Ivan", "Olegovich", 2003,
                "Odessa", "1234", "Astronomy", 2, "211-a");
        students[9] = new Student("Pinchuk", "Ruslana", "Ivanivna", 2002,
                "Odessa", "1234", "Astronomy", 2, "211-a");



        /*Student[] students = new Student[Integer.parseInt(reader.readLine())];
        for (Student student : students) {
            student = new Student(reader.readLine(), reader.readLine(), reader.readLine(), inputData(), reader.readLine(),
                    reader.readLine(), reader.readLine(), inputData(), reader.readLine());

            System.out.println(student);
        }*/

        printFacultyStudentsList(students);
        printGroupStudentsList(students);
        printStudentsAgeList(students);
        printListOfStudentsAtTheFaculty(students);
        printListOfStudentsAtTheGroup(students);


    }

    //для консольного авріанту створення об'єктів
    /*
    public static int inputData() throws IOException {
        return Integer.parseInt(reader.readLine());
    }
    */

    //друкує перелік студентів заданого факнльтету
    public static void printFacultyStudentsList(Student[] students) throws IOException {
        System.out.println("Choose name of Faculty: ");
        for (String faculty: createListOfFaculty(students)) {
            System.out.println(faculty);

        }
        String input = reader.readLine();
        System.out.println("Students: ");
        for (Student student : students) {
            if (input.equals(student.getFaculty())) {
                System.out.println(student.getName() + " " + student.getSurname() + " " + student.getPatronymic());
            }
        }
    }

    //друкує перелік студентів заданої групи
    public static void printGroupStudentsList(Student[] students) throws IOException {
        System.out.println("Choose name of Group: ");
        for (String group: createListOfGroups(students)) {
            System.out.println(group);
        }

        String input = reader.readLine();
        System.out.println("Students: ");
        for (Student student : students) {
            if (input.equals(student.getGroup())) {
                System.out.println(student.getSurname() + " " + student.getName() + " "
                        + student.getPatronymic());
            }
        }
    }


    //друкує перелік студентів старших, ніж введений рік
    public static void printStudentsAgeList(Student[] students) throws IOException {
        System.out.println("Input year: ");
        int input = Integer.parseInt(reader.readLine());
        System.out.println("Students, who are younger than this age: ");
        for (int i = 0; i < students.length - 1; i++) {
            if (input < students[i].getYear()) {
                System.out.println(students[i].getSurname() + " " + students[i].getName() + " "
                        + students[i].getPatronymic());
            }


        }
    }

    //створює список факультетів
    public static ArrayList<String> createListOfFaculty(Student[] students) {
        ArrayList<String> faculties = new ArrayList<>();
        for (Student student : students) {
            int flag = 0;
            for (String faculty : faculties) {

                if (faculty.equals(student.getFaculty())) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                faculties.add(student.getFaculty());
            }
        }
        return faculties;
    }

    //створює список груп
    public static ArrayList<String> createListOfGroups(Student[] students) {
        ArrayList<String> groups = new ArrayList<>();
        for (Student student : students) {
            int flag = 0;
            for (String group : groups) {
                if (group.equals(student.getGroup())) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                groups.add(student.getGroup());
            }
        }
        return groups;
    }


    //друкує перелік студентів по факультетах
    public static void printListOfStudentsAtTheFaculty(Student[] students) {
        for (String faculty : createListOfFaculty(students)) {
            System.out.println("Faculty: " + faculty);
            for (Student student : students) {
                if (faculty.equals(student.getFaculty())) {
                    System.out.println(student.getSurname() + " " + student.getName() + " " + student.getPatronymic());
                }
            }
            System.out.println("-----------------------");
        }
    }

    //друкує перелік студентів по групах
    public static void printListOfStudentsAtTheGroup(Student[] students) {
        for (String group : createListOfGroups(students)) {
            System.out.println("Group: " + group);
            for (Student student : students) {
                if (group.equals(student.getGroup())) {
                    System.out.println(student.getSurname() + " " + student.getName() + " " + student.getPatronymic());
                }
            }
            System.out.println("-----------------------");
        }
    }


}



