public class State {

    private int rowCount;
    private int colCount;
    private int vehicleCount;
    private int rideCount;
    private int bonusCount;
    private int stepCount;

    public State(String[] args) {
        this.rowCount = Integer.parseInt(args[0]);
        this.colCount = Integer.parseInt(args[1]);
        this.vehicleCount = Integer.parseInt(args[2]);
        this.rideCount = Integer.parseInt(args[3]);
        this.bonusCount = Integer.parseInt(args[4]);
        this.stepCount = Integer.parseInt(args[5]);
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getColCount() {
        return colCount;
    }

    public void setColCount(int colCount) {
        this.colCount = colCount;
    }

    public int getVehicleCount() {
        return vehicleCount;
    }

    public void setVehicleCount(int vehicleCount) {
        this.vehicleCount = vehicleCount;
    }

    public int getRideCount() {
        return rideCount;
    }

    public void setRideCount(int rideCount) {
        this.rideCount = rideCount;
    }

    public int getBonusCount() {
        return bonusCount;
    }

    public void setBonusCount(int bonusCount) {
        this.bonusCount = bonusCount;
    }

    public int getStepCount() {
        return stepCount;
    }

    public void setStepCount(int stepCount) {
        this.stepCount = stepCount;
    }
}
