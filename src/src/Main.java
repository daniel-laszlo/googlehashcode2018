import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("a_example.in");
        fileReader.readFile();
        State state = fileReader.getState();
        for (int i = 0; i < state.getStepCount(); ++i) {
			Matrix.calculateMatrix(state)
		}
    }
}