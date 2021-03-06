import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

public class FileReader {

    private BufferedReader bufferedReader;
    public static State state;
    public static List<Ride> rides;
    public static List<Car> cars;

    public FileReader(String fileName) {
        try {
            this.bufferedReader = new BufferedReader(new java.io.FileReader(fileName));
        } catch (FileNotFoundException ex) {
            System.err.println("Error");
        }
        this.rides = new ArrayList<>();
        this.cars = new ArrayList<>();
    }

    private void createCars() {
        for (int i = 0; i < state.getVehicleCount(); ++i) {
            cars.add(new Car(null, new Coordinate(0,0), i));
        }
    }

    void readFile() throws IOException {
        String line = null;
        int lineCounter = 0;

        while ( (line = bufferedReader.readLine()) != null) {
            String[] splittedLine = line.split(" ");

            if (lineCounter == 0) {
                state = new State(splittedLine);
            } else {
                rides.add(new Ride(splittedLine, lineCounter-1));
            }
            ++lineCounter;
        }
        createCars();
        printAll();
    }

    public void printAll() {
//        System.out.println("Initial state: "
//                + " Vehicle count: " + state.getVehicleCount()
//                + " Bonus amount: " + state.getBonusCount()
//                + " Column: " + state.getColCount()
//                + " Rows: " + state.getRowCount()
//                + " Rides: " + state.getRideCount()
//                + " Vehicles: " + state.getVehicleCount()
//                + " Step count: " + state.getStepCount()
//        );
        //rides.forEach( System.out::println );
        //cars.forEach( System.out::println );
    }
}
