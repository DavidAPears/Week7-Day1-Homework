public class Park extends Attraction {

    private double price;
    private int rating;

    public Park(String name, double price, int rating) {
        super(name, rating);
        this.price = price;
    }
}
