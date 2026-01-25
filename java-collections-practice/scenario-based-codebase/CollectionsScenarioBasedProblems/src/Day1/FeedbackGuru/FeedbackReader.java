package Day1.FeedbackGuru;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FeedbackReader {

    private static final Pattern RATING_PATTERN =
            Pattern.compile("(\\d{1,2})/10");

    public static List<Feedback<String>> readFeedbackFile(Path path) {

        List<Feedback<String>> feedbackList = new ArrayList<>();

        try (BufferedReader br = Files.newBufferedReader(path)) {

            String line;

            while ((line = br.readLine()) != null) {

                try {
                    Matcher matcher = RATING_PATTERN.matcher(line);

                    if (!matcher.find()) {
                        throw new Exception("Rating missing");
                    }

                    int rating = Integer.parseInt(matcher.group(1));

                    feedbackList.add(
                            new Feedback<>("Service", line, rating)
                    );

                } catch (Exception e) {
                    // skip invalid line
                    System.out.println("Skipping invalid feedback line");
                }
            }

        } catch (Exception e) {
            System.out.println("Error reading file: " + path.getFileName());
        }

        return feedbackList;
    }
}
