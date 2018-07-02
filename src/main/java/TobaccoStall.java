public class TobaccoStall extends Stall {

    private boolean hygieneCertificatePassed;

    public TobaccoStall(String name, String owner, int parkingSpot, boolean hygieneCertificatePassed, int rating) {
        super(name, owner, parkingSpot, rating);
        this.hygieneCertificatePassed = hygieneCertificatePassed;
    }

    public boolean isAllowedTo(Visitor visitor) {
        return (visitor.getAge() > 18);
    }
}
