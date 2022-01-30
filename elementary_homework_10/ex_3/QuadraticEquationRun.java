package ua.hillel.tatiana.elementary_homework_10.ex_3;

public class QuadraticEquationRun {
    public static void main(String[] args) {
        //3. написать программу для вычисления корней квадратного уравнения
        QuadraticEquation equation1 = new QuadraticEquation(1, 8, 16);
        QuadraticEquation equation2 = new QuadraticEquation(1, 6, 1);
        QuadraticEquation equation3 = new QuadraticEquation(1, -5, 6);
        QuadraticEquation equation4 = new QuadraticEquation(1, -2, 6);
        equation1.getAndPrintRoots();
        equation2.getAndPrintRoots();
        equation3.getAndPrintRoots();
        equation4.getAndPrintRoots();
    }
}
