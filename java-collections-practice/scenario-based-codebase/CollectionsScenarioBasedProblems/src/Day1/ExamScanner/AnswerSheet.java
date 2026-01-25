package Day1.ExamScanner;

public abstract class AnswerSheet<T> {

    protected String studentName;
    protected T[] answers;

    public AnswerSheet(String studentName, T[] answers) {
        this.studentName = studentName;
        this.answers = answers;
    }

    public String getStudentName() {
        return studentName;
    }

    public T[] getAnswers() {
        return answers;
    }
}
