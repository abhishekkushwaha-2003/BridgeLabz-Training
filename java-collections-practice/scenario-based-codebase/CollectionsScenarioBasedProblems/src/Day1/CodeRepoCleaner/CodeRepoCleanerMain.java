package Day1.CodeRepoCleaner;

import java.nio.file.Path;
import java.util.List;
import java.util.Map;

public class CodeRepoCleanerMain {

    public static void main(String[] args) {

        // root folder jahan java files pade hain
        String rootFolder = "javacode";

        //  scan
        List<Path> javaFiles = CodeScanner.scanJavaFiles(rootFolder);
        System.out.println("Total Java Files Found: " + javaFiles.size());

        //  analyze
        Map<FileType, List<Path>> report =
                CodeAnalyzer.analyze(javaFiles);

        //  print result
        for (FileType type : report.keySet()) {
            System.out.println("\n" + type + " FILES:");
            for (Path p : report.get(type)) {
                System.out.println(p);
            }
        }

        // stream-based filter
        List<Path> largeFiles =
                CodeAnalyzer.filterLargeFiles(javaFiles, 1024);

        System.out.println("\nFiles larger than 1KB:");
        for (Path p : largeFiles) {
            System.out.println(p);
        }
    }
}
