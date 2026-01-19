package com.collection.ScenarioBased.InsurancePolicyManagementSystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class InsuranceApp {

    public static void main(String[] args) {

        PolicyManager manager = new PolicyManager();

        Policy p1 = new Policy(101, "Amit", LocalDate.now().plusDays(20), "Health", 5000);

        Policy p2 = new Policy(102, "Neha",LocalDate.now().plusDays(60), "Auto", 3000);

        Policy p3 = new Policy(103, "Rahul", LocalDate.now().plusDays(10), "Home", 7000);

        Policy p4 = new Policy(101, "Duplicate Amit", LocalDate.now().plusDays(25), "Health", 5000);

        manager.addPolicy(p1);
        manager.addPolicy(p2);
        manager.addPolicy(p3);
        manager.addPolicy(p4); // duplicate

        System.out.println("---- All Unique Policies ----");
        manager.displayAllPolicies();

        System.out.println("\n---- Policies Expiring Soon ----");
        manager.policiesExpiringSoon();

        System.out.println("\n---- Health Policies ----");
        manager.policiesByCoverage("Health");

        System.out.println("\n---- Duplicate Policies ----");
        List<Policy> list = new ArrayList<>();
        list.add(p1);
        list.add(p4);
        manager.findDuplicatePolicies(list);

        System.out.println("\n---- Performance Comparison ----");
        PerformanceTest.test(manager.hashSet, "HashSet");
        PerformanceTest.test(manager.linkedHashSet, "LinkedHashSet");
        PerformanceTest.test(manager.treeSet, "TreeSet");
    }
}
