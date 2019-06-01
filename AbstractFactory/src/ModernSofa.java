public class ModernSofa implements Sofa {


    protected boolean isOccupied;

    public ModernSofa() {
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
