public class Car {

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

}
