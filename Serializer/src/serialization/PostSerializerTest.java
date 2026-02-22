package serialization;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class PostSerializerTest {

//    @Test
//    void serializeTest() {
//
//        String content = "Hello World!";
//        String author = "Author";
//        String id = "Id";
//
//        Post post = new Post(content, author, id);
//
//        PostSerializer.serialize(post);
//
//    }

    @Test
    void PostCanSerializeTest() {
        String content = "Hello World!";
        String id = "abd12";
        String author = "nelly";


        Post post = new Post(content, id, author);
        String Filelocation = "C:\\Users\\DELL\\IdeaProjects\\Serializer\\src\\serialization\\output";
        String fileName ="post";
       Path path = Paths.get(Filelocation, fileName);
       PostSerializer.serializer(post, path);
    }

    @Test
    void PostCanDeSerializeTest2() {
        String fileLocation = "C:\\Users\\DELL\\IdeaProjects\\Serializer\\src\\serialization\\output" ;
        String fileName = "post";

        Path path = Paths.get(fileLocation, fileName);
        Post post =  PostDeserializer.deserialize(path);
//        System.out.println(post);
       assertNotNull(post);
        assertEquals("Hello World!", post.getContent());
        assertEquals("abd12", post.getId());
        assertEquals("nelly", post.getAuthor());


    }

}