public class VintageChair implements Chair {


    protected boolean isOccupied;

    public VintageChair() {
    }


    public boolean sitOn() {
        if (isOccupied) {
            return false;
        }
        this.isOccupied = true;
        return true;
    }

    @Override
    public boolean hasLegs() {
        return true;
    }
}
