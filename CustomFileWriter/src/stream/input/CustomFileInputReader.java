package stream.input;

import java.io.FileInputStream;
import java.io.IOException;

public class CustomFileInputReader {
    public static void main(String[] args) {
        String path = "C:\\Users\\DELL\\IdeaProjects\\CustomFileWriter\\src\\CustomFileWriterTest.java";
        try(FileInputStream fileInputStream = new FileInputStream(path)){
            byte [] data = fileInputStream.readAllBytes();
            System.out.println(new String(data));
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
