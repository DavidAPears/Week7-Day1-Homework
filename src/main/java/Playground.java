public class Playground extends Attraction {

    private double price;

    public Playground(String name, double price){
        super(name);
        this.price = price;
    }

//    CAN NOT GET THE TEST FOR THE BELOW WORKING (See playground Test!)

//    @Override
//    public boolean isAllowedTo(Visitor visitor) {
//        if (visitor.getAge() < 16) {
//            return false;
//            }
//            return true;
//            }
}


