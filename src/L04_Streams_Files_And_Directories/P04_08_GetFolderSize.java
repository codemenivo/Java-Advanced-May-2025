package L04_Streams_Files_And_Directories;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class P04_08_GetFolderSize {
    public static void main(String[] args) throws IOException {

        String path = "D:\\Иво1\\Java Course Projects\\Java-Advanced-May-2025\\src\\L04_Streams_Files_And_Directories\\resourses\\ExamResourses";

        File folder = new File(path);

        File[] files = folder.listFiles();

        long sizeFolder = 0;
        assert files != null;
        for (File file : files) {
            long currentSize = file.length();
            sizeFolder += currentSize;
        }

        System.out.printf("Folder size: %d%n", sizeFolder);


    }
}
