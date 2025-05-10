package pl.edu.agh.mwo;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        JsonReader reader = new JsonReader();
        System.out.println(reader.readJson().toString());
    }
}
