package com.collection.ScenarioBased.ImplementBankingSystem;
import java.util.Map;
import java.util.TreeMap;

// This class displays customers sorted by balance
class BalanceSorter {

    void displaySortedByBalance(Map<Integer, Integer> accounts) {

        // TreeMap where key = balance, value = account number
        TreeMap<Integer, Integer> sortedMap = new TreeMap<>();

        for (Map.Entry<Integer, Integer> entry : accounts.entrySet()) {
            sortedMap.put(entry.getValue(), entry.getKey());
        }

        System.out.println("\nAccounts Sorted by Balance:");
        for (Map.Entry<Integer, Integer> entry : sortedMap.entrySet()) {
            System.out.println("Account " + entry.getValue()
                    + " -> Balance: " + entry.getKey());
        }
    }
}
