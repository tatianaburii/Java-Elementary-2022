package ua.hillel.tatiana.lesson4;

public class Method {
    public static void main(String[] args) {

        printMessage("hello");
        printMessage("hi");
        printMessage("bye");
        int number = generateRandom(  10);
        printMessage("random message:" + number);
        int newNumber = generateRandom(  100000);

    }
    public static void printMessage(String message){
        System.out.println(message +"!");
        System.out.println("----");
        System.out.println("____");


    }

    public static int generateRandom(int range) {
        int number = (int) (Math.random() * 100);
        return number;

    }
    /*public static String getString() {
       return String;}
    public static boolean isAllowed() {
        return true; //false}*/
}
