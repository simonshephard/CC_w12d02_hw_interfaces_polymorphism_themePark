package attractions;

import interfaces.ISecurity;
import interfaces.ITicketed;
import park.Visitor;

public class Rollercoaster extends Attraction implements ISecurity, ITicketed {

    public Rollercoaster(String name) {
        super(name);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getHeight() >= 1.45 && visitor.getAge() >= 12) {return true;}
        return false;
    }

    @Override
    public double defaultPrice() {
        return 8.40;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if (visitor.getHeight() >= 2.00) {return defaultPrice() * 2.0;}
        return defaultPrice();
    }
}
