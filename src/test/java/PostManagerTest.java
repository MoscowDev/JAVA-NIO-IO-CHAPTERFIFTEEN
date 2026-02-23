import com.Post;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PostManagerTest {
 

    @Test
    void testJsonObjectCanWriteToFile() throws IOException {

        Post post = new Post();
        post.setPostId(1000);
        post.setId(123);
        post.setBody("First post");
        post.setEmail("mosesogom");
        post.setAuthor("mosesogom");
        String json = PostManager.serialize(post);
        String fileDirectory = "C:\\Users\\DELL\\IdeaProjects\\postManagerApp\\src\\main\\java\\com\\output";
        String fileName = "user.json";
        Path path = Path.of(fileDirectory, fileName);


        PostManager.writeJsonToFile(path, json);
        String dataFromFile = Files.readString(path);
        assertEquals(json, dataFromFile);
    }

    @Test
    void testCanSerializeMultiplePost() {
        ArrayList<Post> posts = new ArrayList<Post>();
        ArrayList<String> json = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Post post = new Post();
            post.setPostId(1000);
            post.setId(123);
            post.setBody("First post");
            post.setEmail("mosesogom");
            post.setAuthor("mosesogom");
            json.add(PostManager.serialize(post));
            posts.add(post);

        }
        json = PostManager.serializeList(posts);
        assertEquals(5, json.size());
    }

    @Test
    void testCanDeserializeMultiplePosts() {
        String json = generatetestJson();
        Post post = PostManager.deserialize(json);
        assertNotNull(post);
        assertEquals(123, post.getPostId());
        assertEquals("First post", post.getBody());
        assertEquals("mosesogom", post.getEmail());

    }

    public static String generatetestJson() {
        String json = """
                {
                  "email" : "mosesogom",
                  "body" : "First post",
                  "author" : "mosesogom",
                  "id" : 123,
                  "date" : [2026,2,17,12,0],
             "post_Id" : 123
         }""";

        return json;
    }


    @Test
    void testCanSerializeWithDatePost() {

        Post post = new Post();
        post.setPostId(1000);
        post.setId(123);
        post.setBody("First post");
        post.setEmail("mosesogom");
        post.setAuthor("mosesogom");
        LocalDateTime date = (LocalDateTime.of(LocalDate.of(2026, 2, 17 ), LocalTime.of(12,00)));

        post.setDate(date);




        String json = PostManager.serialize(post);
        System.out.println("json: "+json);
        assertNotNull(json);
        String expected = """
                {
                  "email" : "mosesogom",
                  "body" : "First post",
                  "author" : "mosesogom",
                  "id" : 123,
                  "date" : [ 2026, 2, 17, 12, 0 ],
                  "post_Id" : 1000
                }""";
        assertEquals(expected.replace("\r\n", "\n"), json.replace("\r\n", "\n"));


    }

}