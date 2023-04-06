package week_by_week.week12.java17Examples.sealedExamplesJava17.vehicle;

public sealed  interface Service permits Car, Truck {

    int getMaxServiceIntervalInMonths();

    default int getMaxDistanceBetweenServicesInKilometers() {
        return 100000;
    }
}
