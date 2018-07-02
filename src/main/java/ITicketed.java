public interface ITicketed {


    double defaultPrice();

    double priceFor(Visitor visitor);

}




// IE: "void cycle(int distance);"