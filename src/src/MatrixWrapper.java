import java.util.List;

public class MatrixWrapper {
	public static void doSth(int[][] matrix, List<Ride> rides, List<Car> cars) {
		int[] chosenRides = (new HungarianAlgorithm(matrix).execute());
		for (int chosenRide = 0; chosenRide < chosenRides.length; chosenRide++) {
			int chosenCar = chosenRides[chosenRide];
			Car car = cars.get(chosenCar);
			Ride ride = rides.get(chosenRide);
			ride.setAssignedCar(car);
			car.setRide(ride);
		}
	}
}
