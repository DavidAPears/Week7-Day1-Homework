public class IceCreamStall extends Stall {

    private boolean hygieneCertificatePassed;

    public IceCreamStall(String name, String owner, int parkingSpot, boolean hygieneCertificatePassed) {
        super(name, owner, parkingSpot);
        this.hygieneCertificatePassed = hygieneCertificatePassed;
    }
}
