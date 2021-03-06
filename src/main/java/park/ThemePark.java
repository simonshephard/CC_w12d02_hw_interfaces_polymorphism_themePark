package park;

import attractions.Attraction;
import interfaces.IReviewed;
import interfaces.ISecurity;
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

    public void addStall(Stall stall) {
        this.stalls.add(stall);
    }

    public void addAttraction(Attraction attraction) {
        this.attractions.add(attraction);
    }

    public ArrayList<IReviewed> getAllReviewed() {
        ArrayList<IReviewed> reviewed = new ArrayList<>();
        for (IReviewed attraction : this.attractions) {
            if (attraction instanceof IReviewed) {
                reviewed.add(attraction);
            }
        }
        for (IReviewed stall : this.stalls) {
            if (stall instanceof IReviewed) {
                reviewed.add(stall);
            }
        }
        return reviewed;
    }

    public ArrayList<ISecurity> getAllAllowedFor(Visitor visitor) {
        ArrayList<ISecurity> secured = new ArrayList<>();
        ArrayList<ISecurity> allowed = new ArrayList<>();
        for (IReviewed attraction : this.attractions) {
            if (attraction instanceof ISecurity) {
                secured.add((ISecurity)attraction);
            }

        }
        for (IReviewed stall : this.stalls) {
            if (stall instanceof ISecurity) {
                secured.add((ISecurity)stall);
            }
        }
        for (ISecurity item : secured) {
            if (item.isAllowedTo(visitor)) {
                allowed.add(item);
            }

        }
        return allowed;
    }

    public String reviewString() {
        String reviews = "";
        for (IReviewed attraction : this.attractions) {
            reviews += (attraction.getName() + ": " + attraction.getRating() + " ");
        }
        for (IReviewed stall : this.stalls) {
            reviews += (stall.getName() + ": " + stall.getRating() + " ");
        }
        return reviews;
    }

}
