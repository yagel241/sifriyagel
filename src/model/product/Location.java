package model.product;

public class Location {

    private int aisle;
    private int shelf;

    public Location(Integer aisle, Integer shelf) {
        this.aisle = aisle;
        this.shelf = shelf;
    }

    @Override
    public String toString() {
        return "Location{" +
                "aisle=" + aisle +
                ", shelf=" + shelf +
                '}';
    }

    public void setAisle(int aisle) {
        this.aisle = aisle;
    }

    public int getAisle() {
        return aisle;
    }

    public void setShelf(int shelf) {
        this.shelf = shelf;
    }

    public int getShelf() {
        return shelf;
    }
}
