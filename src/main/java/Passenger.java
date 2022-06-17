public class Passenger extends Person {

    private int numberOfBags;

    public Passenger(String name, int numberOfBags) {
        super(name);
        this.numberOfBags = numberOfBags;
    }

    public int getNoOfBags() {
        return this.numberOfBags;
    }

    public void setNumberOfBags(int bags) {
        this.numberOfBags = bags;
    }
}
