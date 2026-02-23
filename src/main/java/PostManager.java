import com.Post;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class PostManager {
    public static String serialize(Post post) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
        try {
            String json = mapper.writeValueAsString(post);
            return json;
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);

        }

    }


    public static void writeJsonToFile(Path path, String json) throws IOException {
        Files.writeString(path, json);
    }

    public static ArrayList<String> serializeList(ArrayList<Post> posts) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
        ArrayList<String> jsons = new ArrayList<>();

        try {
            for (int count = 0; count < posts.size(); count++) {
                String json = mapper.writeValueAsString(posts.get(count));
                jsons.add(json);
            }
            return jsons;
        } catch (JsonProcessingException ex) {
            throw new RuntimeException(ex);
        }
    }

    public static Post deserialize(String json) {
     try{   ObjectMapper mapper = new ObjectMapper();
      return   mapper.readValue(json, Post.class);
    }catch(JsonProcessingException ex){
     throw new RuntimeException(ex);

     }
    }
}