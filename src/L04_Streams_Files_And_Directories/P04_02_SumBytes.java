package L04_Streams_Files_And_Directories;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class P04_02_SumBytes {
    public static void main(String[] args) throws IOException {

        Path pathReader = Paths.get("D:\\Иво1\\Java Course Projects\\Java-Advanced-May-2025\\src\\L04_Streams_Files_And_Directories\\resourses\\input.txt");
        BufferedReader reader = new BufferedReader(new FileReader(pathReader.toFile()));

        String line = reader.readLine();
        long sum = 0;
        while (line != null){

            for (char c : line.toCharArray()) {
                sum += c;
            }

            line = reader.readLine();

        }

        System.out.println(sum);

    }
}
