package stream.input;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.nio.file.Path;

public class CloudDataReader {
    public static void main(String[] args){
        final String file = "C:\\Users\\DELL\\IdeaProjects\\CustomFileWriter\\src\\stream\\output\\post.json";
        String url = "https://dummyjson.com/products";
        String data = readDataFrom(url);

        try(FileWriter fileWriter = new FileWriter(file)){
            fileWriter.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

   public static String readDataFrom(String cloudLocation) {
       URI uri = URI.create(cloudLocation);
        try(InputStream inputStream = uri.toURL().openStream()){
            byte[] data = inputStream.readAllBytes();
            return new String(data);
        }catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }


}
