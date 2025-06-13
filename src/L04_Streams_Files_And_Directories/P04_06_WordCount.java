package L04_Streams_Files_And_Directories;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class P04_06_WordCount {
    public static void main(String[] args) throws IOException {

        String pathWord = "D:\\Иво1\\Java Course Projects\\Java-Advanced-May-2025\\src\\L04_Streams_Files_And_Directories\\resourses\\words.txt";
        String pathLine = "D:\\Иво1\\Java Course Projects\\Java-Advanced-May-2025\\src\\L04_Streams_Files_And_Directories\\resourses\\text.txt";

        List<String> wordsInLines = Files.readAllLines(Path.of(pathWord));
        Map<String, Integer> numberOfWords = new HashMap<>();

        for (String line : wordsInLines) {
            Arrays.stream(line.split("\\s+"))
                    .forEach(word -> {
                        numberOfWords.put(word, 0);
                    });
        }

        List<String> lines = Files.readAllLines(Path.of(pathLine));

        for (String line : lines) {
            line = line.replace(",", "");
            Arrays.stream(line.split("\\s+"))
                    .forEach(word -> {
                        if (numberOfWords.containsKey(word)) {
                            int currentCount = numberOfWords.get(word);
                            numberOfWords.put(word, currentCount + 1);
                        }
                    });
        }

        PrintWriter print = new PrintWriter("D:\\Иво1\\Java Course Projects\\Java-Advanced-May-2025\\src\\L04_Streams_Files_And_Directories\\resourses\\results.txt");

        numberOfWords.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .forEach(entry -> print.println(entry.getKey() + " - " + entry.getValue()));

        print.close();

    }
}
