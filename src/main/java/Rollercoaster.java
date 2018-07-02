public class Rollercoaster extends Attraction {

    private double price;
    private int rating;

    public Rollercoaster(String name, double price, int rating) {
        super(name, rating);
        this.price = price;
    }

    public boolean isAllowedTo(Visitor visitor) {
        return ((visitor.getAge() > 12) && (visitor.getHeight() > 145.00));
    }

}
