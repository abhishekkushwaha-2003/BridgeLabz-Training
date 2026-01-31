package com.JSON.IPLAndCensorAnalyzer;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.File;

public class JsonIplProcessor {

    public static void processJson(String input, String output) throws Exception {

        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(new File(input));

        for (JsonNode match : root) {
            ObjectNode obj = (ObjectNode) match;

            obj.put("team1",
                IplCensorUtil.maskTeam(obj.get("team1").asText()));

            obj.put("team2",
                IplCensorUtil.maskTeam(obj.get("team2").asText()));

            obj.put("winner",
                IplCensorUtil.maskTeam(obj.get("winner").asText()));

            obj.put("player_of_match",
                IplCensorUtil.redactPlayer());
        }

        mapper.writerWithDefaultPrettyPrinter()
              .writeValue(new File(output), root);
    }
}
