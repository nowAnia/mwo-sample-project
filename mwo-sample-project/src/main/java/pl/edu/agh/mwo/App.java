package pl.edu.agh.mwo;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        JsonReader reader = new JsonReader();
        System.out.println(reader.readJson().toString());

        List<Pitstop> entries = reader.readJson("mwo-sample-project/src/main/resources/pitstops-data.json");

        for (Pitstop entry : entries) {
            System.out.println("Driver: " + entry.getDriverNumber() +
                    ", Pit duration: " + entry.getPitDuration() +
                    ", Lap: " + entry.getLapNumber());
        }
    }
}
