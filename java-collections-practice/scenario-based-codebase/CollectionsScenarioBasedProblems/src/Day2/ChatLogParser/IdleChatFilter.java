package Day2.ChatLogParser;

import java.util.List;

public class IdleChatFilter implements MessageFilter<ChatMessage> {

    private List<String> idleWords =
            List.of("lol", "brb", "haha", "ok");

    @Override
    public boolean allow(ChatMessage msg) {

        String text = msg.getMessage().toLowerCase();

        for (String word : idleWords) {
            if (text.contains(word)) {
                return false;   
            }
        }
        return true;
    }
}
