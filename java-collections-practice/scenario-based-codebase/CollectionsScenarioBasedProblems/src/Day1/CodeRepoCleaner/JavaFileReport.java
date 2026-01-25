package Day1.CodeRepoCleaner;

import java.nio.file.Path;

public class JavaFileReport {

    private Path filePath;
    private FileType type;

    public JavaFileReport(Path filePath, FileType type) {
        this.filePath = filePath;
        this.type = type;
    }

    public Path getFilePath() {
        return filePath;
    }

    public FileType getType() {
        return type;
    }
}

