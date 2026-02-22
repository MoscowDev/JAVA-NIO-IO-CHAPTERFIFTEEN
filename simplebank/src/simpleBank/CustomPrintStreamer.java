package simpleBank;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.Scanner;

public class CustomPrintStreamer {
    public static void main(String[] args) throws FileNotFoundException {

        String filePath = "C:\\Users\\DELL\\IdeaProjects\\simplebank\\src\\simpleBank\\SimpleBank.java";
        FileInputStream fileInputStream = new FileInputStream(filePath);
        System.setIn(fileInputStream);
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }

    }
}
