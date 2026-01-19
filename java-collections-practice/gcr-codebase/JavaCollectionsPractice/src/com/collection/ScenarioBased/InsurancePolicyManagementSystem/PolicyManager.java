package com.collection.ScenarioBased.InsurancePolicyManagementSystem;

import java.time.LocalDate;
import java.util.*;

class PolicyManager {

    // Different sets
    Set<Policy> hashSet = new HashSet<>();
    Set<Policy> linkedHashSet = new LinkedHashSet<>();
    Set<Policy> treeSet = new TreeSet<>(new ExpiryDateComparator());

    // Add policy to all sets
    public void addPolicy(Policy policy) {
        hashSet.add(policy);
        linkedHashSet.add(policy);
        treeSet.add(policy);
    }

    // method to Display all unique policies
    public void displayAllPolicies() {
        for (Policy p : hashSet) {
            System.out.println(p);
        }
    }

    // method to Policies expiring within next 30 days
    public void policiesExpiringSoon() {
        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);

        for (Policy p : hashSet) {
            if (!p.getExpiryDate().isBefore(today)
                && !p.getExpiryDate().isAfter(next30Days)) {
                System.out.println(p);
            }
        }
    }

    //  method to Policies by coverage type
    public void policiesByCoverage(String type) {
        for (Policy p : hashSet) {
            if (p.getCoverageType().equalsIgnoreCase(type)) {
                System.out.println(p);
            }
        }
    }

    // method to Find duplicate policy numbers
    public void findDuplicatePolicies(List<Policy> list) {

        Set<Integer> seen = new HashSet<>();

        for (Policy p : list) {
            if (!seen.add(p.getPolicyNumber())) {
                System.out.println("Duplicate: " + p);
            }
        }
    }
}

