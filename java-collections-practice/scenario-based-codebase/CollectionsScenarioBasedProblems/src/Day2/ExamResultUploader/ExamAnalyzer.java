package Day2.ExamResultUploader;

import java.util.*;

public class ExamAnalyzer {

    // subject list of marks
    public static Map<String, List<Integer>> groupBySubject(
            List<ExamRecord<String>> records) {

        Map<String, List<Integer>> map = new HashMap<>();

        for (ExamRecord<String> r : records) {
            map.computeIfAbsent(
                    r.getSubject(),
                    k -> new ArrayList<>()
            ).add(r.getMarks());
        }
        return map;
    }

    // top scorer per subject
    public static void printTopScorers(
            Map<String, List<Integer>> subjectMarks) {

        System.out.println("\n--- Top Scorer Per Subject ---");

        for (String subject : subjectMarks.keySet()) {

            PriorityQueue<Integer> pq =
                    new PriorityQueue<>(Collections.reverseOrder());

            pq.addAll(subjectMarks.get(subject));

            System.out.println(
                    subject + " → " + pq.peek()
            );
        }
    }
}
