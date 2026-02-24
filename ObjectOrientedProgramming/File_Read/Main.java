package File_Read;
// How to read a file using Java (3 popular options)-

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//BufferReader + FileReader: Best for reading text files line-by-line.
//FileInputStream: Best for binary files (e.g., images, audio files).
//RandomAccessFile: Best for read/write specific portions of a large file.

public class Main {
    public static void main(String[] args) {

        String filePath = "C:\\Users\\10020928\\Downloads\\test.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            // System.out.println("That file exists");

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Could not locate the file");
        } catch (IOException e) {
            System.out.println("Something went wrong");
        }

    }
}