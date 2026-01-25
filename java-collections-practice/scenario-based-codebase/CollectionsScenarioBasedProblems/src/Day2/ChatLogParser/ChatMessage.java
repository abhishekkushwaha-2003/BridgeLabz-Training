package Day2.ChatLogParser;

public class ChatMessage {

    private String time;
    private String user;
    private String message;

    public ChatMessage(String time, String user, String message) {
        this.time = time;
        this.user = user;
        this.message = message;
    }

    public String getUser() {
        return user;
    }

    public String getMessage() {
        return message;
    }
}

