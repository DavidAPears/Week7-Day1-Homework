public class CandyFlossStall extends Stall {

    private boolean hygieneCertificatePassed;

    public CandyFlossStall(String name, String owner, int parkingSpot, boolean hygieneCertificatePassed, int rating) {
        super(name, owner, parkingSpot, rating);
        this.hygieneCertificatePassed = hygieneCertificatePassed;
    }


}
