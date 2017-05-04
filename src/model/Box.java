package model;


public class Box {
    private double a;

    public Box(double a) {
        this.a = a;
    }
    public Box(){}

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

