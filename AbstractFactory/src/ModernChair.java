public class ModernChair implements Chair {


    protected boolean isOccupied;

    public ModernChair() {
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
        return false;
    }
}
