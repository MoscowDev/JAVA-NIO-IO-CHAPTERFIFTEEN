package stream.input;

import java.io.DataInputStream;
import java.io.IOException;

public class CustomDataInputReaderTwo {
    public static void main(String[] args){
        System.out.println("Enter your name: ");
       try( DataInputStream dataInputStream = new DataInputStream(System.in);){
           byte[] data = dataInputStream.readNBytes(12);
           System.out.println("Your name is: " + new String(data));
       } catch (IOException e) {
           e.printStackTrace();
       }

    }

}
