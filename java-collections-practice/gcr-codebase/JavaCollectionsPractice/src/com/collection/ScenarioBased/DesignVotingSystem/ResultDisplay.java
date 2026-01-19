package com.collection.ScenarioBased.DesignVotingSystem;

import java.util.Map;
import java.util.TreeMap;

// This class displays final result in sorted order
class ResultDisplay {

    void displaySortedResult(Map<String, Integer> voteCount) {

        TreeMap<String, Integer> sortedMap =
                new TreeMap<>(voteCount);

        System.out.println("\nFinal Result (Sorted):");
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() +
                               " : " + entry.getValue());
        }
    }
}
