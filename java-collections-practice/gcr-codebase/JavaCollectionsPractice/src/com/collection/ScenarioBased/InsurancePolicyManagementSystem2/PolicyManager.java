package com.collection.ScenarioBased.InsurancePolicyManagementSystem2;

import java.time.LocalDate;
import java.util.*;

class PolicyManager {

    // HashMap for fast lookup
    Map<Integer, Policy> hashMap = new HashMap<>();

    // LinkedHashMap to maintain insertion order
    Map<Integer, Policy> linkedHashMap = new LinkedHashMap<>();

    // TreeMap to keep policies sorted by expiry date
    Map<LocalDate, List<Policy>> treeMap = new TreeMap<>();

    // Add policy to all maps
    void addPolicy(Policy policy) {

        hashMap.put(policy.getPolicyNumber(), policy);
        linkedHashMap.put(policy.getPolicyNumber(), policy);

        // TreeMap sorting by expiry date
        treeMap
            .computeIfAbsent(policy.getExpiryDate(),
                             k -> new ArrayList<>())
            .add(policy);
    }

    // Retrieve policy by policy number
    Policy getPolicyByNumber(int policyNumber) {
        return hashMap.get(policyNumber);
    }

    //  List policies expiring within next 30 days
    void policiesExpiringSoon() {

        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);

        for (Policy p : hashMap.values()) {
            if (!p.getExpiryDate().isBefore(today)
                && !p.getExpiryDate().isAfter(next30Days)) {

                System.out.println(p);
            }
        }
    }

    //  List policies by policyholder name
    void policiesByHolder(String name) {

        for (Policy p : hashMap.values()) {
            if (p.getPolicyHolderName().equalsIgnoreCase(name)) {
                System.out.println(p);
            }
        }
    }

    //  Remove expired policies
    void removeExpiredPolicies() {

        LocalDate today = LocalDate.now();

        Iterator<Map.Entry<Integer, Policy>> iterator =
                hashMap.entrySet().iterator();

        while (iterator.hasNext()) {

            Policy p = iterator.next().getValue();

            if (p.getExpiryDate().isBefore(today)) {
                iterator.remove();
                linkedHashMap.remove(p.getPolicyNumber());
            }
        }
    }

    // Display policies in insertion order
    void displayInsertionOrder() {
        for (Policy p : linkedHashMap.values()) {
            System.out.println(p);
        }
    }

    // Display policies sorted by expiry date
    void displaySortedByExpiry() {
        for (LocalDate date : treeMap.keySet()) {
            for (Policy p : treeMap.get(date)) {
                System.out.println(p);
            }
        }
    }
}
