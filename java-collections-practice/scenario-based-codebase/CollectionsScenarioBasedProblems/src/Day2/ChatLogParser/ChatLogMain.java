package Day2.ChatLogParser;

import java.util.List;

public class ChatLogMain {
    public static void main(String[] args) {

        String filePath = "chatlogs/chat.txt";

        List<ChatMessage> messages =
                ChatLogReader.readLogs(filePath);

        ChatAnalyzer analyzer = new ChatAnalyzer();
        analyzer.analyze(messages, new IdleChatFilter());
        analyzer.printResult();
    }
}
