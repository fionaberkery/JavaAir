public class CabinCrewMember extends Person {

    private Rank rank;

    public CabinCrewMember(String name, Rank rank) {
        super(name);
        this.rank = rank;
    }

    public Rank getRank(){
        return this.rank;
    }

    public String tellPassengersToPutSeatbeltsOn() {
        return "The pilot has turned on the fasten seatbelt sign";
    }

    public String offerPassengerADrink() {
        return "Would you like a drink?";
    }
}
