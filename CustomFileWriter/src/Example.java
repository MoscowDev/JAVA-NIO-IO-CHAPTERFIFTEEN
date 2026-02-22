import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Example {

    /*
    1. create a path that points to a location on your computer and a file name.
    2. use a method from the Files class to create a file at the location specified by the path. 
    Handle any exceptions that may occur during file creation.(Use a method of class files to operate on the path you created.
     Handle any exceptions that may occur during file creation.)
     */
    public static void main(String[] args) {
        String fileLocation = "C:\\Users\\DELL\\MrFemiTask\\Example.java";
        String fileName = "user.json";
        Path path = Path.of(fileLocation, fileName);

        try {
            Files.createFile(path);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}