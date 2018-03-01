public class Car {

    private int identifier;
    private Ride ride = null;

	// Time to complete the current ride
	private int timeToComplete = 0;

    // Only refreshing when ride or assign is over
    private Coordinate currentCoordinate;

    // Is assigned to a ride
    public boolean isAssigned() {
        return ride != null;
    }

	public int getTimeToComplete() {
		return timeToComplete;
	}

	public void setTimeToComplete(int timeToComplete) {
		this.timeToComplete = timeToComplete;
	}

    public void setRide(Ride newRide) {
		ride = newRide;
		int waitTime = ride.getStart() - FileReader.state.getCurrentStep() - Coordinate.distance(currentCoordinate, ride.getPickupPlace());
        timeToComplete = Coordinate.distance(this.currentCoordinate, ride.getPickupPlace()) + ride.getDistance() + waitTime;
    }

    public int getIdentifier() {
        return identifier;
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

    public void iterate() {
        if (ride != null) {
            if (timeToComplete == 0) {
                this.currentCoordinate = ride.getDropPlace();
                ride = null;
                ride.setAssignedCar(null);
                ride.setDone(true);
            }
            timeToComplete --;
        }
    }
}
