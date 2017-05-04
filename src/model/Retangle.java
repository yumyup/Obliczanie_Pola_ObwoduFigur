package model;

public class Retangle {
    private double a, b;


    public Retangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Retangle() {
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

    public double circutRetangle(double g, double h) {
        if (a <= 0 || b <= 0)
            throw new DivideByZeroException();
        else {
            double cirRe = (2 * g + 2 * h);
            return cirRe;
        }

    }
}