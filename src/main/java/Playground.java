public class Playground extends Attraction {

    private double price;
    private int rating;

    public Playground(String name, double price, int rating){
        super(name, rating);
        this.price = price;
    }

    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge() < 16;
    }
}


