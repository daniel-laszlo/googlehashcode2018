public class Ride {

    // Start time
    private int start;

    // End time
    private int end;

    //Pickup coordinate and drop coordinate
    private Coordinate pickupPlace;
    private Coordinate dropPlace;

    // If driver assigned, this is not null
    private Car assignedCar = null;

    // Is the drive already done?
    private boolean done;

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public Coordinate getPickupPlace() {
        return pickupPlace;
    }

    public void setPickupPlace(Coordinate pickupPlace) {
        this.pickupPlace = pickupPlace;
    }

    public Coordinate getDropPlace() {
        return dropPlace;
    }

    public void setDropPlace(Coordinate dropPlace) {
        this.dropPlace = dropPlace;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public boolean isAssigned() {
        return assignedCar != null;
    }

}
