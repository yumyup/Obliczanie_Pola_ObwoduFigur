package model;

public class Circle {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public Circle() {
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double squareCircle(double r) {
        if (r <= 0)
            throw new DivideByZeroException();
        else {
            double sqc = (Math.PI * r * r);
            return sqc;
        }
    }
}
