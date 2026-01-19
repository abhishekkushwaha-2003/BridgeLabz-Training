package com.collection.ScenarioBased.InsurancePolicyManagementSystem2;

import java.time.LocalDate;

class InsuranceApp {

    public static void main(String[] args) {

        PolicyManager manager = new PolicyManager();

        Policy p1 = new Policy(101, "Amit",
                LocalDate.now().plusDays(20),
                "Health", 5000);

        Policy p2 = new Policy(102, "Neha",
                LocalDate.now().plusDays(60),
                "Auto", 3000);

        Policy p3 = new Policy(103, "Amit",
                LocalDate.now().plusDays(10),
                "Home", 7000);

        Policy p4 = new Policy(104, "Rahul",
                LocalDate.now().minusDays(5),
                "Health", 4000);

        manager.addPolicy(p1);
        manager.addPolicy(p2);
        manager.addPolicy(p3);
        manager.addPolicy(p4);

        System.out.println("---- Retrieve Policy by Number ----");
        System.out.println(manager.getPolicyByNumber(101));

        System.out.println("\n---- Policies Expiring in 30 Days ----");
        manager.policiesExpiringSoon();

        System.out.println("\n---- Policies for Amit ----");
        manager.policiesByHolder("Amit");

        System.out.println("\n---- Remove Expired Policies ----");
        manager.removeExpiredPolicies();
        manager.displayInsertionOrder();

        System.out.println("\n---- Policies Sorted by Expiry Date ----");
        manager.displaySortedByExpiry();
    }
}
