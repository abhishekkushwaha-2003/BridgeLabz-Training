package Day1.ResumeAnalyzer;

public class ResumeMain {
    public static void main(String[] args) {

        ResumeAnalyzer analyzer = new ResumeAnalyzer();

        // resumes folder should contain .txt resumes
        analyzer.readResumesFromFolder("resumes");

        System.out.println("\n---- Sorted Candidates ----");
        analyzer.showSortedBySkillCount();
    }
}
