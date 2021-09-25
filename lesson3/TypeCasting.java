package ua.hillel.tatiana.lesson3;

public class TypeCasting {
    public static void main(String[] args) {
        byte byteNumber = 127;
        short shortNumber = 12765;
        shortNumber = (byte) byteNumber;
        System.out.println("byteNumber after manual casting:" + byteNumber);



    }
}
