public class Rollercoaster extends Attraction {

    private double price;

    public Rollercoaster(String name, double price) {
        super(name);
        this.price = price;
    }

    public boolean isAllowedTo(Visitor visitor) {
        return ((visitor.getAge() > 12) && (visitor.getHeight() > 145.00));
    }

}
