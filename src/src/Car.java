public class Car {

    private int identifier;
    private Ride ride = null;

	public int getTimeToComplete() {
		return timeToComplete;
	}

	public void setTimeToComplete(int timeToComplete) {
		this.timeToComplete = timeToComplete;
	}

	// Time to complete the current ride
	private int timeToComplete = 0;

    // Only refreshing when ride or assign is over
    private Coordinate currentCoordinate;

    // Is assigned to a ride
    public boolean isAssigned() {
        return ride != null;
    }

    public void setRide(Ride newRide) {
		int waitTime = ride.getStart() - state. - Coordinate.distance(car.getCurrentCoordinate(), ride.getPickupPlace())
        timeToComplete = Coordinate.distance(this.currentCoordinate, newRide.getPickupPlace()) +
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

    public String toString() {
        return "Car: " + this.identifier + " current coord: " + this.currentCoordinate + " ride: " + this.ride;
    }
}
