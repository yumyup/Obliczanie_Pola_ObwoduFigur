package app;
import model.ShapeCalculator;
import java.util.Scanner;

public class ShapeCalculatorTest {
    public static void main(String[] args) {
        System.out.println("Obliczanie pola kwadratu, pola koła, obwodu trójkąta i obwodu prostokąta");
        ShapeCalculator shapeCalculator = new ShapeCalculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj bok kwadratu: a=");
        double a = scanner.nextDouble();
        System.out.println("podaj promień koła r=");
        double r = scanner.nextDouble();
        System.out.println("podaj bok trójkąta a=");
        double d = scanner.nextDouble();
        System.out.println("podaj bok trójkąta b=");
        double e = scanner.nextDouble();
        System.out.println("podaj bok trójkąta c=");
        double f = scanner.nextDouble();
        System.out.println("podaj bok prostokąta a=");
        double g = scanner.nextDouble();
        System.out.println("podaj bok prostokąta b=");
        double h = scanner.nextDouble();
        double sqb = shapeCalculator.sqareBox(a);
        double sqc = shapeCalculator.sqareCircle(r);
        double cirTr = shapeCalculator.circutTriangle(d, e, f);
        double cirRe = shapeCalculator.circutRetangle(g, h);
        System.out.println();
        System.out.println("WYNIKI: ");
        System.out.println("Pole kwadratu o boku " + a + " = " + sqb);
        System.out.println("Pole koła o promieniu " + r + " = " + sqc);
        System.out.println("Obwód trójkąta o bokach " + d + "," + e + "," + f + " = " + cirTr);
        System.out.println("Obwód prostokąta o bokach " + g + "," + h + " = " + cirRe);
    }
}
