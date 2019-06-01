public class ModernRoundedTable implements CoffeeTable {
    public ModernRoundedTable() {}

    @Override
    public int numberOfLegs() {
        return 3;
    }

    @Override
    public boolean isRounded() {
        return true;
    }
}
