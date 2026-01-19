package com.collection.ScenarioBased.DesignVotingSystem;

import java.util.LinkedHashMap;
import java.util.Map;

// This class maintains the order in which votes are cast
class VoteOrderTracker {

    private Map<Integer, String> voteOrder = new LinkedHashMap<>();
    private int voteId = 1;

    // Store vote order
    void recordVote(String candidate) {
        voteOrder.put(voteId++, candidate);
    }

    // Display vote order
    void displayVoteOrder() {
        System.out.println("Vote Order:");
        for (Map.Entry<Integer, String> entry : voteOrder.entrySet()) {
            System.out.println("Vote " + entry.getKey() +
                               " -> " + entry.getValue());
        }
    }
}
