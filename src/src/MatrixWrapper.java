import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MatrixWrapper {

	public static Map<Integer , List<Integer>> carRides = new HashMap();

	public static void doSth(int[][] matrix, List<Ride> rides, List<Car> cars) {
		int[] chosenRides = (new HungarianAlgorithm(matrix).execute());
		for (int chosenRide = 0; chosenRide < chosenRides.length; chosenRide++) {
			int chosenCar = chosenRides[chosenRide];
			Car car = cars.get(chosenCar);
			Ride ride = rides.get(chosenRide);
			ride.setAssignedCar(car);
			car.setRide(ride);


			if (carRides.get(car.getIdentifier()) == null) {
				carRides.put(car.getIdentifier(), new ArrayList<Integer>(ride.getIdentifier()));
			} else {
				carRides.get(car.getIdentifier()).add(ride.getIdentifier());
			}
		}
	}

	public static void printSolution() {
		for (int i = 0; i < FileReader.state.getVehicleCount();i++) {
			List<Integer> list = carRides.get(i);
			if (list == null) {
				System.out.println(0);
			} else {
				System.out.print(list.size() + " ");
				for (int j : list) {
					System.out.print(list.get(j) + " ");
				}
				System.out.println();
			}
		}
	}
}
