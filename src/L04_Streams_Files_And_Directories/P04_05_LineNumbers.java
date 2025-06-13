package L04_Streams_Files_And_Directories;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class P04_05_LineNumbers {
    public static void main(String[] args) throws IOException {

        String path = "D:\\Иво1\\Java Course Projects\\Java-Advanced-May-2025\\src\\L04_Streams_Files_And_Directories\\resourses\\inputLineNumbers.txt";
        List<String> lines = Files.readAllLines(Path.of(path));

        BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\Иво1\\Java Course Projects\\Java-Advanced-May-2025\\src\\L04_Streams_Files_And_Directories\\resourses\\output.txt"));

        int rowNumber = 1;

        for (String line : lines) {
            writer.write(rowNumber + ". " + line);
            writer.newLine();
            rowNumber++;
        }

        writer.close();

    }
}
