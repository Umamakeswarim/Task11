package task11Java;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        String fileName = "example.txt";

        try {
            // Attempt to open the file
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            // Read data from the file and print it to the console
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Close the file
            reader.close();
        } catch (FileNotFoundException e) {
            // File not found exception handling
            System.err.println("Error: File '" + fileName + "' not found.");
        } catch (IOException e) {
            // IO exception handling
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }
}
