package stalls;

import interfaces.ITicketed;
import park.Visitor;

public class CandyFlossStall extends Stall implements ITicketed {

    public CandyFlossStall(String name, String ownerName, int parkingSpot) {
        super(name, ownerName, parkingSpot);
    }

    @Override
    public double defaultPrice() {
        return 4.20;
    }

    @Override
    public double priceFor(Visitor visitor) {
        return defaultPrice();
    }


}
