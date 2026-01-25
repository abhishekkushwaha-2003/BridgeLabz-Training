package Day2.ChatLogParser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChatLogReader {

   
    private static final Pattern CHAT_PATTERN =
            Pattern.compile("\\[(.*?)\\]\\s+(.*?):\\s+(.*)");

    public static List<ChatMessage> readLogs(String filePath) {

        List<ChatMessage> messages = new ArrayList<>();

        try (BufferedReader br =
                     new BufferedReader(new FileReader(filePath))) {

            String line;

            while ((line = br.readLine()) != null) {

                Matcher matcher = CHAT_PATTERN.matcher(line);

                if (matcher.matches()) {
                    String time = matcher.group(1);
                    String user = matcher.group(2);
                    String msg = matcher.group(3);

                    messages.add(
                            new ChatMessage(time, user, msg)
                    );
                }
            }

        } catch (Exception e) {
            System.out.println("Error reading chat logs");
        }

        return messages;
    }
}
