public class WaterTank {

    private int current;
    private int maxCapacity;

    //constructor to simulate the "dump" if there is excess water
    public WaterTank(int current, int maxCapacity) {
        if (current > maxCapacity) {
            current = maxCapacity;
        this.current = current;
        this.maxCapacity = maxCapacity;
        }
    }

    //accessors
    public int getCurrent () {
        return current;
    }

    public int getMaxCapacity () {
        return maxCapacity;
    }

    //methods
    public void add ( int volume){
        this.current = this.current + volume;
        if (current > maxCapacity) {
            current = maxCapacity;
        }
    }
    public void drain ( int volume){
        this.current = this.current - volume;
        if (current < 0) {
            current = 0;
        }
    }
        public void print () {
            System.out.printf("The tank volume is %d gallons", getCurrent());
    }
}
