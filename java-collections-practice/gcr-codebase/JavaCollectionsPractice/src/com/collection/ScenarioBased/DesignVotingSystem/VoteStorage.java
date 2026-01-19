package com.collection.ScenarioBased.DesignVotingSystem;

import java.util.HashMap;
import java.util.Map;

// This class stores total votes for each candidate
class VoteStorage {

    private Map<String, Integer> voteCount = new HashMap<>();

    // Add vote for a candidate
    void addVote(String candidate) {

        if (voteCount.containsKey(candidate)) {
            voteCount.put(candidate, voteCount.get(candidate) + 1);
        } else {
            voteCount.put(candidate, 1);
        }
    }

    // Return vote count map
    Map<String, Integer> getVoteCount() {
        return voteCount;
    }
}
