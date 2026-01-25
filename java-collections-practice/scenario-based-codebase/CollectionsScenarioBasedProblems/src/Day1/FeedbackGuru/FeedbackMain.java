package Day1.FeedbackGuru;

import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class FeedbackMain {
    public static void main(String[] args) {

        List<Feedback<String>> allFeedbacks = new ArrayList<>();

        try {
            Files.list(Paths.get("feedbacks"))
                    .filter(p -> p.toString().endsWith(".txt"))
                    .forEach(p ->
                            allFeedbacks.addAll(
                                    FeedbackReader.readFeedbackFile(p)
                            )
                    );

        } catch (Exception e) {
            System.out.println("Error reading feedback folder");
        }

        FeedbackAnalyzer analyzer = new FeedbackAnalyzer();
        analyzer.analyze(allFeedbacks);
        analyzer.printSummary();
    }
}
