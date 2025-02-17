package hu.ruander.alakzatok;

public class Hasab extends FemAlakzat{

    private double a,b,m;

    public Hasab(double a, double b, double m) {
        this.a = a;
        this.b = b;
        this.m = m;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getM() {
        return m;
    }

    @Override
    public double terfogat() {
        return a*b*m;
    }
}
