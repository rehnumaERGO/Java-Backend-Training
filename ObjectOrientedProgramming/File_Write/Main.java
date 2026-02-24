package File_Write;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String filepath = "C:\\Users\\10020928\\Downloads\\test.txt";
        String textContent = """
                It was a bright cold day in April,
                and the clocks were striking thirteen
                """;
        try (FileWriter writer = new FileWriter(filepath)) {
            writer.write(textContent);
            System.out.println("File has been written");
        } catch (FileNotFoundException e) {
            System.out.println("Could not locate the file location");
        } catch (IOException e) {
            System.out.println("Could not write file");
        }
    }
}
