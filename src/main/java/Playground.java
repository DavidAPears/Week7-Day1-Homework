public class Playground extends Attraction {

    private double price;

    public Playground(String name, double price){
        super(name);
        this.price = price;
    }

    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge() < 16;
    }
}


