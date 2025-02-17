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
}
