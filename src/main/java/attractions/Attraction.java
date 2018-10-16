package attractions;

import interfaces.IReviewed;

public abstract class Attraction implements IReviewed {

    private String name;
    private int rating;

    public Attraction(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getRating() {
        return this.rating;
    }


}
