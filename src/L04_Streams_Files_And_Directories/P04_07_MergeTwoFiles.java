package L04_Streams_Files_And_Directories;

import java.awt.image.ImagingOpException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class P04_07_MergeTwoFiles {
    public static void main(String[] args) throws IOException {

        String path_1 = "D:\\Иво1\\Java Course Projects\\Java-Advanced-May-2025\\src\\L04_Streams_Files_And_Directories\\resourses\\inputOne.txt";
        String path_2 = "D:\\Иво1\\Java Course Projects\\Java-Advanced-May-2025\\src\\L04_Streams_Files_And_Directories\\resourses\\inputTwo.txt";

        List<String> linesFile_1 = Files.readAllLines(Path.of(path_1));
        List<String> linesFile_2 = Files.readAllLines(Path.of(path_2));

        BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\Иво1\\Java Course Projects\\Java-Advanced-May-2025\\src\\L04_Streams_Files_And_Directories\\resourses\\output.txt"));

        for (String text_1 : linesFile_1) {
            try {
                writer.write(text_1);
                writer.newLine();
            }catch (IOException exception){
                exception.printStackTrace();
            }
        }

        linesFile_2.forEach(line_2 -> {
            try {
                writer.write(line_2);
                writer.newLine();
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        });

        writer.close();


    }
}
