package Day2.ExamResultUploader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class ExamResultReader {

    // RollNo,Name,Subject,Marks
    private static final Pattern VALID_LINE =
            Pattern.compile("\\d+,[A-Za-z ]+,[A-Za-z ]+,\\d{1,3}");

    public static List<ExamRecord<String>> readResults(String filePath)
            throws InvalidRecordException {

        List<ExamRecord<String>> records = new ArrayList<>();

        try (BufferedReader br =
                     new BufferedReader(new FileReader(filePath))) {

            String line;
            br.readLine(); // skip header

            while ((line = br.readLine()) != null) {

                if (!VALID_LINE.matcher(line).matches()) {
                    throw new InvalidRecordException(
                            "Invalid record format: " + line
                    );
                }

                String[] data = line.split(",");

                String roll = data[0];
                String name = data[1];
                String subject = data[2];
                int marks = Integer.parseInt(data[3]);

                records.add(
                        new ExamRecord<>(roll, name, subject, marks)
                );
            }

        } catch (InvalidRecordException e) {
            throw e;
        } catch (Exception e) {
            System.out.println("Error reading result file");
        }

        return records;
    }
}
