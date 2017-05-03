package model;


public class SquareBox {
    private double a;

    public SquareBox(double a) {
        this.a = a;
    }
    public SquareBox(){}

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public static double squareBox(double a) {
        if (a <= 0)
            throw new DivideByZeroException();
        else {
            double sqb = (a * a);
            return sqb;
        }
    }
}

