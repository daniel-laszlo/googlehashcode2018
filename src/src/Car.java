public class Car {

    private int identifier;
    private Ride ride = null;

    // Only refreshing when ride or assign is over
    private Coordinate currentCoordinate;

    // Is assigned to a ride
    public boolean isAssigned() {
        return ride != null;
    }

    public void setRide(Ride newRide) {
        ride = newRide;
    }

    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public Ride getRide() {
        return ride;
    }

    public Coordinate getCurrentCoordinate() {
        return currentCoordinate;
    }

    public void setCurrentCoordinate(Coordinate currentCoordinate) {
        this.currentCoordinate = currentCoordinate;
    }

    public Car(Ride ride, Coordinate currentCoordinate, int identifier) {
        this.ride = ride;
        this.currentCoordinate = currentCoordinate;
        this.identifier = identifier;
    }
}