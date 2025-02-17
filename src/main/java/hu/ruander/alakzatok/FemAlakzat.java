package hu.ruander.alakzatok;

public abstract class FemAlakzat {

    abstract public double terfogat();

    public static double getFajsuly() {
        return 1.15;
    }

    public double suly() {
        return terfogat() * getFajsuly();
    }
}
