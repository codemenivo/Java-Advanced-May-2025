package L04_Streams_Files_And_Directories;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class P04_01_SumLines {
    public static void main(String[] args) throws IOException {

        Path pathRead = Paths.get("D:\\Иво1\\Java Course Projects\\Java-Advanced-May-2025\\src\\L04_Streams_Files_And_Directories\\resourses\\input.txt");
        BufferedReader reader = new BufferedReader(new FileReader(pathRead.toFile()));
        //List<String> allLines = Files.readAllLines(Path.of(pathRead.toUri()));
        String currentLine = reader.readLine();
        

        while (currentLine != null){
            int sum = 0;
            for (int i = 0; i < currentLine.length(); i++) {
                sum += currentLine.charAt(i);

            }

            System.out.println(sum);
            currentLine = reader.readLine();

        }

        reader.close();
        
    }
}
