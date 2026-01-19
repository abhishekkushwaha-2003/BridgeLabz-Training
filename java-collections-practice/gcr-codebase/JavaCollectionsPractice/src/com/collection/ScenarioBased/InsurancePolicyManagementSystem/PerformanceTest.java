package com.collection.ScenarioBased.InsurancePolicyManagementSystem;

import java.time.LocalDate;
import java.util.*;
class PerformanceTest {

    public static void test(Set<Policy> set, String name) {

        Policy p =
            new Policy(999, "Test User",
            LocalDate.now().plusDays(10),
            "Health", 5000);

        long start = System.nanoTime();
        set.add(p);
        long addTime = System.nanoTime() - start;

        start = System.nanoTime();
        set.contains(p);
        long searchTime = System.nanoTime() - start;

        start = System.nanoTime();
        set.remove(p);
        long removeTime = System.nanoTime() - start;

        System.out.println(name + " -> Add: " + addTime +
                " ns | Search: " + searchTime +
                " ns | Remove: " + removeTime + " ns");
    }
}
