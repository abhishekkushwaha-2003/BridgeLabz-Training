package Day1.ResumeAnalyzer;

public class ResumeData {

    private String email;
    private String phone;
    private int keywordCount;

    public ResumeData(String email, String phone, int keywordCount) {
        this.email = email;
        this.phone = phone;
        this.keywordCount = keywordCount;
    }

    public String getEmail() {
        return email;
    }

    public int getKeywordCount() {
        return keywordCount;
    }

    @Override
    public String toString() {
        return "Email: " + email +
               ", Phone: " + phone +
               ", Skill Matches: " + keywordCount;
    }
}
