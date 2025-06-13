package L04_Streams_Files_And_Directories;

import java.io.*;
import java.nio.file.Files;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class P04_04_CountCharecterTypes {
    public static void main(String[] args) throws IOException {

        String path = "D:\\Иво1\\Java Course Projects\\Java-Advanced-May-2025\\src\\L04_Streams_Files_And_Directories\\resourses\\input.txt";
        BufferedReader reader = new BufferedReader(new FileReader(path));

        String currentLine = reader.readLine();

        Set<Character> vowels = new HashSet<>();
        Collections.addAll(vowels, 'a', 'e', 'i', 'o', 'u');

        Set<Character> punctuationSymbols = new HashSet<>();
        Collections.addAll(punctuationSymbols, '.', ',', '!', '?');

        int countVowels = 0;
        int countPunctuations = 0;
        int countOtherSymbols = 0;

        while (currentLine != null){
            currentLine = currentLine.replaceAll("\\s+", "");

            for (char symbol : currentLine.toCharArray()){
                if (vowels.contains(symbol)){
                    countVowels++;
                } else if (punctuationSymbols.contains(symbol)) {
                    countPunctuations++;
                }else {
                    countOtherSymbols++;
                }
            }

            currentLine = reader.readLine();
        }

        PrintWriter writeOutput = new PrintWriter("D:\\Иво1\\Java Course Projects\\Java-Advanced-May-2025\\src\\L04_Streams_Files_And_Directories\\resourses\\output.txt");
        writeOutput.printf("Vowels: %d%n", countVowels);
        writeOutput.printf("Other symbols: %d%n", countOtherSymbols);
        writeOutput.printf("Punctuation: %d%n", countPunctuations);

        reader.close();
        writeOutput.close();

    }
}
