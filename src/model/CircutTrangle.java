package model;

public class CircutTrangle {
    private double a, b ,c;

    public CircutTrangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public CircutTrangle() {
    }

    public double circutTriangle(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0)
            throw new DivideByZeroException();
        else {
            double cirT = (a + b + c);
            return cirT;
        }
    }
}
