public enum Rank {

    CAPTAIN("Pilot"),
    FIRSTOFFICER("Co-Pilot"),
    SECONDOFFICER("Cruise-Relief"),
    PURSER("Cabin Crew Team Lead"),
    FLIGHTATTENDENT("Cabin Crew");

    private final String title;

    Rank(String title) {
        this.title = title;
    }



}
