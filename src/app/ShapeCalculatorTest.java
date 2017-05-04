package app;

import model.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ShapeCalculatorTest {
    public static final int SQARE_BOX = 0;
    public static final int SQARE_CIRCLE = 1;
    public static final int CIRCUT_TRANGLE = 2;
    public static final int CIRCUT_RECTANGLE = 3;
    public static final int EXIT = 4;

    public static void main(String[] args) {
        System.out.println("Obliczanie pola kwadratu, pola koła, obwodu trójkąta i obwodu prostokąta");
        int option = 0;
        Scanner scanner = new Scanner(System.in);
        Box squareB = new Box();
        Circle squareC = new Circle();
        Trangle circutTr = new Trangle();
        Retangle circutRet = new Retangle();
        do {
            System.out.println("Wybierz opcję");
            System.out.println(SQARE_BOX + " pole kwadratu");
            System.out.println(SQARE_CIRCLE + " pole koła");
            System.out.println(CIRCUT_TRANGLE + " obwód trójkąta");
            System.out.println(CIRCUT_RECTANGLE + " obwód prostokąta");
            System.out.println(EXIT + " koniec programu");
            option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case SQARE_BOX:
                    System.out.println("podaj bok kwadratu: a=");
                    double a = scanner.nextDouble();
                    try {
                        double sqb = squareB.squareBox(a);
                        System.out.println("Pole kwadratu o boku " + a + " = " + sqb);
                    } catch (DivideByZeroException e) {
                        System.err.println("Wprowadz cyfrę większą od 0");
                    }
                    break;
                case SQARE_CIRCLE:
                    System.out.println("podaj promień koła r");
                    double r = scanner.nextDouble();
                    try {
                        double sqc = squareC.squareCircle(r);
                        System.out.println("Pole koła o promieniu " + r + " = " + sqc);
                    } catch (DivideByZeroException e | InputMismatchException ex) {
                        System.err.println("Wprowadz cyfrę większą od 0");
                    }
                    break;
                case CIRCUT_TRANGLE:
                    System.out.println("podaj bok trójkąta a");
                    double a = scanner.nextDouble();
                    try {
                        System.out.println("podaj bok trójkąta b");

                    } catch (DivideByZeroException e) {
                        System.err.println("Wprowadz cyfrę większą od 0");
                    }
                    double b = scanner.nextDouble();
                    System.out.println("podaj bok trójkąta c");

                    System.err.println("Wprowadz cyfrę większą od 0");

                    double c = scanner.nextDouble();
                    double cirTr = circutTr.circutTriangle(a,b,c);
                    System.out.println("Obwód trójkąta o bokach a" + a + ", b=" + b + ",c=" + c + " = " + cirTr);
                    break;
                case CIRCUT_RECTANGLE:
                    System.out.println("podaj bok prostokąta a");
                    double a = scanner.nextDouble();
                    System.out.println("podaj bok prostokąta b");
                    double b = scanner.nextDouble();
                    double cirRe = circutRet.circutRetangle(a, b);
                    System.out.println("Obwód prostokąta o bokach a=" + a + ",b=" + b + " = " + cirRe);
                    break;
            }
        } while (option != EXIT);

        System.out.println("Bye bye");
    }
}

