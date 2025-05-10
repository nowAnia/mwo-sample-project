package pl.edu.agh.mwo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.IOException;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonReader {
    public JsonReader() throws JsonProcessingException {
    }

    public Pitstop readJson() throws IOException {
        return new ObjectMapper().readValue(Files.readString(Paths.get("src/main/resources/one-pitstop.json")), Pitstop.class);
    }



}
