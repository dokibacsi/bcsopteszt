package hu.ruander;

import hu.ruander.alakzatok.FemAlakzat;
import hu.ruander.alakzatok.Gomb;
import hu.ruander.alakzatok.Hasab;
import java.util.ArrayList;

public class FemAlakzatokProgram {

    private ArrayList<FemAlakzat> femaalkzatok;
    Gomb gomb;
    Hasab hasab;

    public FemAlakzatokProgram () {
        this.femaalkzatok = new ArrayList<>(getLista());
        ujAlakzat(new Hasab(3,1,2));
        ujAlakzat(new Gomb(3));
    }

    public void ujAlakzat(Hasab hasab) {
        femaalkzatok.add(hasab);
    }

    public void ujAlakzat(Gomb gomb) {
        femaalkzatok.add(gomb);
    }

    public ArrayList<FemAlakzat> getLista(){
        return femaalkzatok;
    }

    public double osszSuly() {
        double osszSuly = 0;
        for (FemAlakzat femAlakzat : femaalkzatok) {
            osszSuly += femAlakzat.suly();
        }
        return osszSuly;
    }

    public double gombokOsszSuly() {
        double gombOsszSuly = 0;
        for (FemAlakzat femAlakzat : femaalkzatok) {
            if(femAlakzat.equals(gomb)){
                gombOsszSuly += femAlakzat.suly();
            }
        }
        return gombOsszSuly;
    }

    public FemAlakzat minV() {
        double legkisebb = 0;
        for (int i = 0; i < femaalkzatok.size(); i++) {
            if(legkisebb < femaalkzatok.get(i).terfogat()){
                legkisebb = femaalkzatok.get(i).terfogat();
            }
        }
        return femaalkzatok.get((int) legkisebb);
    }

    public FemAlakzat maxV() {
        double legnagyobb = 0;
        for (int i = 0; i < femaalkzatok.size(); i++) {
            if(legnagyobb < femaalkzatok.get(i).terfogat()){
                legnagyobb = femaalkzatok.get(i).terfogat();
            }
        }
        return femaalkzatok.get((int) legnagyobb);
    }
}
