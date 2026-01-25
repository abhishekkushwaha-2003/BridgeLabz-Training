package Day2.ChatLogParser;

import java.util.*;

public class ChatAnalyzer {

    private Map<String, List<String>> userMessages =
            new TreeMap<>();  

    public void analyze(
            List<ChatMessage> messages,
            MessageFilter<ChatMessage> filter
    ) {

        for (ChatMessage msg : messages) {

            if (!filter.allow(msg)) {
                continue;   
            }

            userMessages
                    .computeIfAbsent(
                            msg.getUser(),
                            k -> new ArrayList<>()
                    )
                    .add(msg.getMessage());
        }
    }

    public void printResult() {

        System.out.println("\n--- Chat Analysis ---");

        for (String user : userMessages.keySet()) {
            System.out.println(user + ":");
            for (String msg : userMessages.get(user)) {
                System.out.println("  - " + msg);
            }
        }
    }
}

