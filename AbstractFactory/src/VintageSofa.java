public class VintageSofa implements Sofa {


    protected boolean isOccupied;

    public VintageSofa() {
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
