package Day1.CodeRepoCleaner;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class CodeAnalyzer {

    // method name should start with lowercase
    private static final Pattern BAD_METHOD_PATTERN =
            Pattern.compile("\\bvoid\\s+[A-Z][a-zA-Z0-9]*\\s*\\(");

    // unused import (very basic check)
    private static final Pattern IMPORT_PATTERN =
            Pattern.compile("^import\\s+.*;", Pattern.MULTILINE);

    public static Map<FileType, List<Path>> analyze(List<Path> files) {

        Map<FileType, List<Path>> result = new HashMap<>();
        result.put(FileType.VALID, new ArrayList<>());
        result.put(FileType.WARNINGS, new ArrayList<>());
        result.put(FileType.ERRORS, new ArrayList<>());

        Set<String> uniqueFiles = new HashSet<>();

        for (Path file : files) {

            try {
                String content = Files.readString(file);

                boolean badMethod = BAD_METHOD_PATTERN.matcher(content).find();
                boolean hasImport = IMPORT_PATTERN.matcher(content).find();

                // duplicate check
                if (!uniqueFiles.add(file.getFileName().toString())) {
                    result.get(FileType.ERRORS).add(file);
                }
                else if (badMethod || hasImport) {
                    result.get(FileType.WARNINGS).add(file);
                }
                else {
                    result.get(FileType.VALID).add(file);
                }

            } catch (IOException e) {
                result.get(FileType.ERRORS).add(file);
            }
        }

        return result;
    }

    //  filter files using streams
    public static List<Path> filterLargeFiles(List<Path> files, long sizeInBytes) {

        return files.stream()
                .filter(p -> {
                    try {
                        return Files.size(p) > sizeInBytes;
                    } catch (Exception e) {
                        return false;
                    }
                })
                .collect(Collectors.toList());
    }
}
