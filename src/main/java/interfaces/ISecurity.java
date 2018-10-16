package interfaces;

import park.Visitor;

public interface ISecurity {

    public boolean isAllowedTo(Visitor visitor);
}
