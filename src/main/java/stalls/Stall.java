package stalls;

import interfaces.IReviewed;

public abstract class Stall implements IReviewed {

    private String name;
    private String ownerName;
    private int parkingSpot;
    private int rating;
    private double defaultPrice;

    public Stall(String name, String ownerName, int parkingSpot) {
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
    }

    public String getName() {
        return this.name;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public int getParkingSpot() {
        return this.parkingSpot;
    }

    public int getRating() {
        return this.rating;
    }

}
