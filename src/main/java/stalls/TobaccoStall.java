package stalls;

import interfaces.ISecurity;
import park.Visitor;

public class TobaccoStall extends Stall implements ISecurity {

    public TobaccoStall(String name, String ownerName, int parkingSpot) {
        super(name, ownerName, parkingSpot);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() >= 18) {return true;}
        return false;
    }

}
