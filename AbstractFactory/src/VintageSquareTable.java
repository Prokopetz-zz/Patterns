public class VintageSquareTable implements CoffeeTable {
    public VintageSquareTable() {}

    @Override
    public int numberOfLegs() {
        return 4;
    }

    @Override
    public boolean isRounded() {
        return false;
    }
}
