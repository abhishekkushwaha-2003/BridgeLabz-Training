package Day1.FeedbackGuru;

public class Feedback<T> {

    private T type;        
    private String text;   
    private int rating;   

    public Feedback(T type, String text, int rating) {
        this.type = type;
        this.text = text;
        this.rating = rating;
    }

    public String getText() {
        return text;
    }

    public int getRating() {
        return rating;
    }
}

