package starter.settings.data;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public abstract class SetJSON {

    static final String SOURCE = "src/test/resources/data/source_data.json";
    private boolean gotData;

    protected final Boolean getRootJSONData(String data) {
        try {
            Reader reader = Files.newBufferedReader(Paths.get(SOURCE));

            ObjectMapper objectMapper = new ObjectMapper();

            JsonNode parser = objectMapper.readTree(reader);

            gotData = parser.path(data).asBoolean();

            return gotData;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return gotData;
    }

}
