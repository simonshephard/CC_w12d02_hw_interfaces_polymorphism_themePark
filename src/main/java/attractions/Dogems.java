package attractions;

import interfaces.ITicketed;
import park.Visitor;

public class Dogems extends Attraction implements ITicketed {

    public Dogems(String name) {
        super(name);
    }

    @Override
    public double defaultPrice() {
        return 2.80;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if (visitor.getAge() < 12) {return defaultPrice() * 0.5;}
        return defaultPrice();
    }
}
