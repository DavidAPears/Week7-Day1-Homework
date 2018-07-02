public class IceCreamStall extends Stall {

    private boolean hygieneCertificatePassed;

    public IceCreamStall(String name, String owner, int parkingSpot, boolean hygieneCertificatePassed, int rating) {
        super(name, owner, parkingSpot, rating);
        this.hygieneCertificatePassed = hygieneCertificatePassed;
    }
}
