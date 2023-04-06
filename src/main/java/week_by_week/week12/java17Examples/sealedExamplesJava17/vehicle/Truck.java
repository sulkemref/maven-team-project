package week_by_week.week12.java17Examples.sealedExamplesJava17.vehicle;

public non-sealed class Truck implements Service{
    private final int loadCapacity;

    public Truck(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public int getMaxServiceIntervalInMonths() {
        return 18;
    }
}
