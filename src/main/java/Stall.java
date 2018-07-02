public abstract class Stall {

//    Abstract Class !

    private String name;
    private String owner;
    private int parkingSpot;
    private int rating;

    public Stall(String name, String owner, int parkingSpot, int rating){
        this.name = name;
        this.owner = owner;
        this.parkingSpot = parkingSpot;
        this.rating = rating;
    }

    public String getName() {return name; }
    public String getOwner() {return owner; }
    public int getParkingSpot() {return parkingSpot; }
    public int getRating() { return rating; }

}
