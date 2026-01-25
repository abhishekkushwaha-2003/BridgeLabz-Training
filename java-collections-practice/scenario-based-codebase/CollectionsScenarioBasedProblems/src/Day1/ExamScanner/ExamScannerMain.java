package Day1.ExamScanner;

import java.util.Map;

public class ExamScannerMain {
    public static void main(String[] args) {

        // Answer key
        String[] answerKey = {"A", "B", "C", "D", "A", "B", "C"};

        // CSV file path
        String filePath = "answers/exam1.csv";

        Map<String, Integer> result =
                ExamScanner.evaluate(filePath, answerKey);

        ExamScanner.printRanking(result);
    }
}
