package model;

public class ShapeCalculator {
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;
    private double g;
    private double h;
    private double r;

    public ShapeCalculator(double a, double b, double c, double d, double e, double f, double g, double h, double r) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.r = r;
    }

    public ShapeCalculator() {
    }

    public double sqareBox(double a) {
        double sqb = (a * a);
        return sqb;
    }

    public double sqareCircle(double r) {
        double sqc = (Math.PI * r * r);
        return sqc;
    }

    public double circutTriangle(double d, double e, double f) {
        double cirT = (d + e + f);
        return cirT;
    }

    public double circutRetangle(double g, double h) {
        double cirRe = (2 * g + 2 * h);
        return cirRe;
    }
}