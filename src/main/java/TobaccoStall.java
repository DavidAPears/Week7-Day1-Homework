public class TobaccoStall extends Stall {

    private boolean hygieneCertificatePassed;

    public TobaccoStall(String name, String owner, int parkingSpot, boolean hygieneCertificatePassed) {
        super(name, owner, parkingSpot);
        this.hygieneCertificatePassed = hygieneCertificatePassed;
    }
}
