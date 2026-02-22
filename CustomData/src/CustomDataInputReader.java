import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class CustomDataInputReader {
    public static void main(String[] args) {
        String path = "C:\\Users\\DELL\\IdeaProjects\\CustomData\\src\\CustomDataInputReader.java";
        try (FileInputStream fileInputStream = new FileInputStream(path)){
        byte [] data =fileInputStream.readAllBytes();
                System.out .println(new String(data));
        }catch (IOException ex){
            ex.printStackTrace();
        }
        }
    }

