package L04_Streams_Files_And_Directories;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;

public class P04_03_AllCapitals {
    public static void main(String[] args) throws IOException {

        String path = "D:\\Иво1\\Java Course Projects\\Java-Advanced-May-2025\\src\\L04_Streams_Files_And_Directories\\resourses\\input.txt";
        String readContent = Files.readString(Path.of(path));
        readContent = readContent.toUpperCase();

        PrintWriter writContent = new PrintWriter("D:\\Иво1\\Java Course Projects\\Java-Advanced-May-2025\\src\\L04_Streams_Files_And_Directories\\resourses\\output.txt");
        writContent.write(readContent); //.println(readContent) също записва цялото съдържание

        /*
          BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\Иво1\Java Course Projects\Java-Advanced-May-2025\src\L04_Streams_Files_And_Directories\resourses\output.txt"));
          bufferedWriter.write(readContent);
         */

        writContent.close();

    }
}
