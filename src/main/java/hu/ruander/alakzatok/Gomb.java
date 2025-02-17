package hu.ruander.alakzatok;

public class Gomb extends FemAlakzat{

    private double sugar;
    public Gomb(double sugar) {
        this.sugar = sugar;
    }

    @Override
    public double terfogat() {
        return (4 * Math.pow(sugar, 3) * Math.PI) / 3;
    }
}
