package week_by_week.week12.sealedExamplesJava17.vehicle;

public abstract sealed class Vehicle permits Car {

    protected final String registrationNumber;

    public Vehicle(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }
}
