package pl.edu.agh.mwo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class JsonReader {

    private final ObjectMapper mapper;

    public JsonReader() {
        this.mapper = new ObjectMapper();
    }

    public Pitstop readJson() throws IOException {
        return mapper.readValue(Files.readString(Paths.get("mwo-sample-project/src/main/resources/one-pitstop.json")), Pitstop.class);
    }

    public List<Pitstop> readJson(String filePath) {
        try {
            Pitstop[] entries = mapper.readValue(new File(Paths.get(filePath).toUri()), Pitstop[].class);
            return Arrays.asList(entries);
        } catch (IOException e) {
            e.printStackTrace();
            return List.of();
        }
    }
}
