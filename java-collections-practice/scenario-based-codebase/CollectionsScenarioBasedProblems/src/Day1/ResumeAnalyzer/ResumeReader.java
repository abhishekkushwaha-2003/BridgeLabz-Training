package Day1.ResumeAnalyzer;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ResumeReader {

    private static final Pattern EMAIL_PATTERN =
            Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-z]{2,}");

    private static final Pattern PHONE_PATTERN =
            Pattern.compile("\\d{10}");

    private static final Pattern SKILL_PATTERN =
            Pattern.compile("Java|Python|Spring", Pattern.CASE_INSENSITIVE);

    public static ResumeData readResume(Path filePath) throws Exception {

        BufferedReader br = Files.newBufferedReader(filePath);

        String line;
        String email = "";
        String phone = "";
        int skillCount = 0;

        while ((line = br.readLine()) != null) {

            Matcher emailMatcher = EMAIL_PATTERN.matcher(line);
            if (emailMatcher.find()) {
                email = emailMatcher.group();
            }

            Matcher phoneMatcher = PHONE_PATTERN.matcher(line);
            if (phoneMatcher.find()) {
                phone = phoneMatcher.group();
            }

            Matcher skillMatcher = SKILL_PATTERN.matcher(line);
            while (skillMatcher.find()) {
                skillCount++;
            }
        }

        br.close();

        // invalid resume (email missing)
        if (email.isEmpty()) {
            throw new Exception("Invalid Resume Format");
        }

        return new ResumeData(email, phone, skillCount);
    }
}
