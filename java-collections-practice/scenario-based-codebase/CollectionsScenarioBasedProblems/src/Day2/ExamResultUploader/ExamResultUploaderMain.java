package Day2.ExamResultUploader;

import java.util.List;
import java.util.Map;

public class ExamResultUploaderMain {
    public static void main(String[] args) {

        String filePath = "results/marks.csv";

        try {
            List<ExamRecord<String>> records =
                    ExamResultReader.readResults(filePath);

            Map<String, List<Integer>> subjectWise =
                    ExamAnalyzer.groupBySubject(records);

            ExamAnalyzer.printTopScorers(subjectWise);

        } catch (InvalidRecordException e) {
            System.out.println(e.getMessage());
        }
    }
}
