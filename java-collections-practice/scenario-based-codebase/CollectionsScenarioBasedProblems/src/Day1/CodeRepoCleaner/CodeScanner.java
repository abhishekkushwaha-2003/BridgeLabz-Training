package Day1.CodeRepoCleaner;

import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class CodeScanner {

    public static List<Path> scanJavaFiles(String rootFolder) {

        List<Path> javaFiles = new ArrayList<>();

        try {
            Files.walk(Paths.get(rootFolder))
                    .filter(p -> p.toString().endsWith(".java"))
                    .forEach(javaFiles::add);

        } catch (Exception e) {
            System.out.println("Error scanning folders");
        }

        return javaFiles;
    }
}
