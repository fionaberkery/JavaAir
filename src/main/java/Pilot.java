public class Pilot extends Person {

    private Rank rank;
    private String licenceNumber;

    public Pilot(String name, Rank rank, String licenceNumber) {
        super(name);
        this.licenceNumber = licenceNumber;
        this.rank = rank;
    }

    public Rank getRank() {
        return this.rank;
    }

    public String getLicenceNumber() {
        return this.licenceNumber;
    }

    public String flyPlane() {
        return "Look at me I'm flying a plane";
    }
}
