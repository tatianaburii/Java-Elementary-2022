package ua.hillel.tatiana.homework7;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.Arrays;

public class ArrayCoppyNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input numbers size:");
        int size = Integer.parseInt(reader.readLine());

        int[] numbers = new int [size];
        for (int i = 0; i < size; i++) {
            //numbers[i] = Integer.parseInt(reader.readLine());
            numbers[i] = (int) (Math.random() * 100);

        }
        int[] numbersOne = Arrays.copyOf(numbers, size/2);
        int[] numbersTwo = Arrays.copyOfRange(numbers, size/2, size);
        System.out.println("Масив, введений з консолі: numbers =" + Arrays.toString(numbers));
        System.out.println("Масив, отриманий копіюванням: numbersOne =" + Arrays.toString(numbersOne));
        System.out.println("Масив, отриманий копіюванням: numbersTwo =" + Arrays.toString(numbersTwo));


    }

}
