import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Daniel on 01/03/2018.
 */
public class Matrix {

	public static int[][] calculateMatrix(List<Car> carList, List<Ride> rideList, State state, int step) {
		List<Car> filteredCarList = carList.stream()
				.filter(car -> !car.isAssigned())
				.collect(Collectors.toList());
		List<Ride> filteredRideList = rideList.stream()
				.filter(ride -> !ride.isAssigned())
				.collect(Collectors.toList());

		int[][] matrix = new int[filteredCarList.size()][filteredRideList.size()];

		for (int i = 0; i < filteredCarList.size(); ++i) {
			Car car = filteredCarList.get(i);
			for (int j = 0; j < filteredRideList.size(); ++j) {
				Ride ride = filteredRideList.get(j);
				int distanceBetweenCarAndPickupPlace = Coordinate.distance(car.getCurrentCoordinate(), ride.getPickupPlace());
				int rideIsFulfilledAtStep = step + distanceBetweenCarAndPickupPlace + ride.getDistance();
				// nem erunk oda idoben
				if (rideIsFulfilledAtStep > state.getStepCount() || rideIsFulfilledAtStep > ride.getEnd()) {
					matrix[i][j] = 0;
				// kesobb er oda
				} else if (step + distanceBetweenCarAndPickupPlace > ride.getStart()) {
					matrix[i][j] = ride.getDistance();
				// idoben, vagy elotte er oda
				} else if (step + distanceBetweenCarAndPickupPlace <= ride.getStart()) {
					matrix[i][j] = ride.getDistance() + state.getBonusCount() - (ride.getStart() - step - distanceBetweenCarAndPickupPlace);
				}
			}
		}
		return matrix;
	}
}
