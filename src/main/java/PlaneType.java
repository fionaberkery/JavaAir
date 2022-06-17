public enum PlaneType {

    BOEING737(215,12900),
    BOEING747(605, 36300),
    BOEING767(375, 22500),
    BOEING777(550, 33000),
    BOEING787(330, 19800),
    BOEINGTEST(1, 19800),
    ;

    private final int capacity;
    private final int totalWeight;


    PlaneType(int capacity, int totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }


    public int getCapacity(){
        return this.capacity;
    }

    public int getTotalWeight(){
        return this.totalWeight;
    }
}
