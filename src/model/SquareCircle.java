package model;

public class SquareCircle {
    private double r;

    public SquareCircle(double r) {
        this.r = r;
    }

    public SquareCircle() {
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
