public class Ride {

    public Ride(String[] args, int identifier) {
        this.start = Integer.parseInt(args[4]);
        this.end = Integer.parseInt(args[5]);
        this.pickupPlace = new Coordinate(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        this.dropPlace = new Coordinate(Integer.parseInt(args[2]), Integer.parseInt(args[3]));
        this.assignedCar = null;
        this.done = false;
        this.identifier = identifier;
    }

    private int identifier;

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

    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public Car getAssignedCar() {
        return assignedCar;
    }

    public void setAssignedCar(Car assignedCar) {
        this.assignedCar = assignedCar;
    }
}
