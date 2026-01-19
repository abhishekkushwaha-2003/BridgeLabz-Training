package com.collection.ScenarioBased.InsurancePolicyManagementSystem;

import java.util.Comparator;

class ExpiryDateComparator implements Comparator<Policy> {

    @Override
    public int compare(Policy p1, Policy p2) {

        int result = p1.getExpiryDate()
                       .compareTo(p2.getExpiryDate());

        // If expiry date same, compare by policy number
        return (result == 0)
                ? p1.getPolicyNumber() - p2.getPolicyNumber()
                : result;
    }
}
