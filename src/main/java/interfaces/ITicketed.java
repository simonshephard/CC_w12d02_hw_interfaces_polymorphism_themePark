package interfaces;
import park.Visitor;

public interface ITicketed {

    public double defaultPrice();
    public double priceFor(Visitor visitor);

}
