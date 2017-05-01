package app;

import model.ShapeCalculator;

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
        ShapeCalculator shapeCalculator = new ShapeCalculator();
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
                    double sqb = shapeCalculator.sqareBox(a);
                    System.out.println("Pole kwadratu o boku " + a + " = " + sqb);
                    break;
                case SQARE_CIRCLE:
                    System.out.println("podaj promień koła r=");
                    double r = scanner.nextDouble();
                    double sqc = shapeCalculator.sqareCircle(r);
                    System.out.println("Pole koła o promieniu " + r + " = " + sqc);
                    break;
                case CIRCUT_TRANGLE:

                    System.out.println("podaj bok trójkąta a=");
                    double d = scanner.nextDouble();
                    System.out.println("podaj bok trójkąta b=");
                    double e = scanner.nextDouble();
                    System.out.println("podaj bok trójkąta c=");
                    double f = scanner.nextDouble();
                    double cirTr = shapeCalculator.circutTriangle(d, e, f);
                    System.out.println("Obwód trójkąta o bokach a=" + d + ", b=" + e + ",c=" + f + " = " + cirTr);
                    break;
                case CIRCUT_RECTANGLE:
                    System.out.println("podaj bok prostokąta a=");
                    double g = scanner.nextDouble();
                    System.out.println("podaj bok prostokąta b=");
                    double h = scanner.nextDouble();
                    double cirRe = shapeCalculator.circutRetangle(g, h);
                    System.out.println("Obwód prostokąta o bokach a=" + g + ",b=" + h + " = " + cirRe);
                    break;
            }
        } while (option != EXIT);

        System.out.println("Bye bye");
        System.out.println();
        System.out.println("WYNIKI: ");


    }
}

