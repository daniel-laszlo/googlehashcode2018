import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("a_example.in");
        fileReader.readFile();
        State state = FileReader.state;
        for (int step = 0; step < state.getStepCount(); ++step) {
        	Matrix.calculateMatrix(FileReader.cars, FileReader.rides, FileReader.state, step);
        	for (int i = 0; i < FileReader.cars.size(); ++i) {
        		FileReader.cars.get(i).iterate();
			}
		}
    }
}