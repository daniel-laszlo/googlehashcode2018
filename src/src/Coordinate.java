public class Coordinate {

    // Row
    private int r;

    // Column
    private int c;

    public Coordinate(int row, int col) {
        r = row;
        c = col;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public static int distance(Coordinate from, Coordinate to) {
        return Math.abs(to.c -  from.c) + Math.abs(to.r - to.c);
    }

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public String toString() {
        return "Coordinate: " + this.c + " x " + this.r;
    }

}