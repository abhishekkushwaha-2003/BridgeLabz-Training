package Day1.ResumeAnalyzer;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class ResumeAnalyzer {

    private Map<String, ResumeData> resumeMap = new HashMap<>();
    private List<ResumeData> resumeList = new ArrayList<>();

    public void readResumesFromFolder(String folderPath) {

        try {
            Files.list(Paths.get(folderPath))
                    .filter(p -> p.toString().endsWith(".txt"))
                    .forEach(this::processResume);

        } catch (Exception e) {
            System.out.println("Error reading folder");
        }
    }

    private void processResume(Path path) {

        try {
            ResumeData data = ResumeReader.readResume(path);

            resumeMap.put(data.getEmail(), data);
            resumeList.add(data);

        } catch (Exception e) {
            System.out.println("Skipping invalid resume: " + path.getFileName());
        }
    }

    public void showSortedBySkillCount() {

        resumeList.sort(
                (a, b) -> b.getKeywordCount() - a.getKeywordCount()
        );

        for (ResumeData data : resumeList) {
            System.out.println(data);
        }
    }
}
