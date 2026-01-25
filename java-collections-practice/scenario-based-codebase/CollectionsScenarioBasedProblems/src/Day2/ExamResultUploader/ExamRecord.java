package Day2.ExamResultUploader;

public class ExamRecord<T> {

    private String rollNo;
    private String name;
    private T subject;
    private int marks;

    public ExamRecord(String rollNo, String name, T subject, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.subject = subject;
        this.marks = marks;
    }

    public T getSubject() {
        return subject;
    }

    public int getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }
}

