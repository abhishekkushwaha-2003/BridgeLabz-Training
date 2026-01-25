package Day1.ExamScanner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
import java.util.regex.Pattern;

public class ExamScanner {

    private static final Pattern VALID_LINE =
            Pattern.compile("^[A-Za-z ]+(,[A-D])+$");

    public static Map<String, Integer> evaluate(
            String filePath,
            String[] answerKey
    ) {

        Map<String, Integer> scoreMap = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;

            while ((line = br.readLine()) != null) {

                try {
                    // Regex validation
                    if (!VALID_LINE.matcher(line).matches()) {
                        throw new Exception("Invalid format");
                    }

                    String[] parts = line.split(",");

                    String name = parts[0];
                    int score = 0;

                    for (int i = 1; i < parts.length && i <= answerKey.length; i++) {
                        if (parts[i].equals(answerKey[i - 1])) {
                            score++;
                        }
                    }

                    scoreMap.put(name, score);

                } catch (Exception e) {
                    System.out.println("Skipping invalid line: " + line);
                }
            }

        } catch (Exception e) {
            System.out.println("Error reading file");
        }

        return scoreMap;
    }

    // Ranking using PriorityQueue
    public static void printRanking(Map<String, Integer> scoreMap) {

        PriorityQueue<Map.Entry<String, Integer>> pq =
                new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        pq.addAll(scoreMap.entrySet());

        System.out.println("\n--- Exam Rankings ---");

        while (!pq.isEmpty()) {
            Map.Entry<String, Integer> entry = pq.poll();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
