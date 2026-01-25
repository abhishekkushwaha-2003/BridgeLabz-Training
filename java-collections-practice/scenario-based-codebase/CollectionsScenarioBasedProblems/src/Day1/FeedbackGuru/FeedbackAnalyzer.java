package Day1.FeedbackGuru;

import java.util.*;

public class FeedbackAnalyzer {

    private Map<String, List<String>> feedbackMap = new HashMap<>();

    public FeedbackAnalyzer() {
        feedbackMap.put("Positive", new ArrayList<>());
        feedbackMap.put("Neutral", new ArrayList<>());
        feedbackMap.put("Negative", new ArrayList<>());
    }

    public void analyze(List<Feedback<String>> feedbacks) {

        for (Feedback<String> fb : feedbacks) {

            int rating = fb.getRating();

            if (rating >= 8) {
                feedbackMap.get("Positive").add(fb.getText());
            }
            else if (rating >= 5) {
                feedbackMap.get("Neutral").add(fb.getText());
            }
            else {
                feedbackMap.get("Negative").add(fb.getText());
            }
        }
    }

    public void printSummary() {

        System.out.println("\n---- Feedback Summary ----");

        for (String category : feedbackMap.keySet()) {
            System.out.println(category + " Feedback:");
            for (String text : feedbackMap.get(category)) {
                System.out.println("- " + text);
            }
            System.out.println();
        }
    }
}
