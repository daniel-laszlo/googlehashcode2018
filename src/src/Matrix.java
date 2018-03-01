import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Daniel on 01/03/2018.
 */
public class Matrix {



	public static int[][] calculateMatrix(List<Car> carList, List<Ride> rideList, State state) {
		List<Car> filteredCarList = carList.stream()
				.filter(car -> !car.isAssigned())
				.collect(Collectors.toList());


		List<Ride> filteredRideList = rideList.stream()
				.filter(ride -> !ride.isAssigned())
				.collect(Collectors.toList());

		for (Car car : filteredCarList) {

		}

	}
}
