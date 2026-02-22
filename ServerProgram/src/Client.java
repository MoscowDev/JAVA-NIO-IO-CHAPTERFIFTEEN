import java.io.*;
import java.net.*;

public class Client {

    public static void main(String[] args) {

        try {
            Socket socket = new Socket("172.16.0.218", 5000);

            PrintWriter output = new PrintWriter(
                    socket.getOutputStream(), true
            );

            output.println("Hello from Client!");

            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
