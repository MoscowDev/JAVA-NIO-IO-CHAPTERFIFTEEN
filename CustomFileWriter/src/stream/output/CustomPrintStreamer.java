package stream.output;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CustomPrintStreamer {
    public static void main(String[] args) throws FileNotFoundException {
        String fileLocation = "C:\\Users\\DELL\\IdeaProjects\\CustomFileWriter\\src\\stream\\output\\post.json";
        FileInputStream fileInputStream = new FileInputStream(fileLocation);
        System.setIn(fileInputStream);
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            System.out.println(line);
        }

    }
}
