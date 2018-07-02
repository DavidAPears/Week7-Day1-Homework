public class CandyFlossStall extends Stall {

    private boolean hygieneCertificatePassed;

    public CandyFlossStall(String name, String owner, int parkingSpot, boolean hygieneCertificatePassed) {
        super(name, owner, parkingSpot);
        this.hygieneCertificatePassed = hygieneCertificatePassed;
    }
}
