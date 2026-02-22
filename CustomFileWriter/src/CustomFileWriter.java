import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CustomFileWriter {

    public static void writeJsonToFile(Path path, String json) throws IOException {
        Files.writeString(path,json);
    }


    public static void readYamlFromFile(Path path, String yaml) throws IOException {
        Files.readString(path);
        System.out.println(yaml);
    }

    public static void writeYamlFromFile(Path path, String yaml) throws IOException {
        Files.writeString(path,yaml);
        System.out.println(yaml);
    }
}