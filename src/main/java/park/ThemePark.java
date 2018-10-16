package park;

import attractions.Attraction;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;

    public ThemePark() {
        this.attractions = new ArrayList<>();
        this.stalls = new ArrayList<>();
    }

    public void visit(Visitor visitor, Attraction attraction) {
        //
    }

    public int countAttractions() {
        return this.attractions.size();
    }
    public int countStalls() {
        return this.stalls.size();
    }


}
