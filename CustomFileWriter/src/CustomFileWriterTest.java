import static org.junit.jupiter.api.Assertions.*;

import java.nio.file.Files;
import java.nio.file.Path;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CustomFileWriterTest {

    @Test
    public void testCanWriteToFile() throws java.io.IOException {
        String fileDirectory = "C:\\Users\\DELL\\MrFemiTask";
        String fileName = "user.json";
        Path path = Path.of(fileDirectory, fileName);

        String json = "{\n  \"name\": \"John Doe\",\n  \"age\": 30,\n  \"country\": \"USA\"\n}";

        CustomFileWriter.writeJsonToFile(path, json);
        String dataFromFile = Files.readString(path);
        assertEquals(json, dataFromFile);
    }

    @Test
    public void testCanReadFromFileWithNewLine() throws java.io.IOException {
        String fileDirectory = "C:\\Users\\DELL\\MrFemiTask";
        String fileName = "user.yamal";
        Path path = Path.of(fileDirectory, fileName);

        String yaml ="""
                name: Zeus
                age: 10000
                country: USA
                """;
        CustomFileWriter.readYamlFromFile(path, yaml);
        String readFromFile = Files.readString(path);
        assertEquals(yaml, readFromFile);
    }

    @Test
    public void testCanReadFromFile() throws java.io.IOException {
        String fileDirectory = "C:\\Users\\DELL\\MrFemiTask";
        String fileName = "user.json";
        Path path = Path.of(fileDirectory, fileName);
        String yaml ="""
                name: Zeus
                age: 10000
                country: USA
                """;
        CustomFileWriter.writeYamlFromFile(path, yaml);
        String readFromFile = Files.readString(path);
        assertEquals(yaml, readFromFile);
    }
}