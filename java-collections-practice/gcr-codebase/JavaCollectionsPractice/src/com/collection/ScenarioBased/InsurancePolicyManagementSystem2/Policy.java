package com.collection.ScenarioBased.InsurancePolicyManagementSystem2;

import java.time.LocalDate;

//Policy class to store policy details
class Policy {

 private int policyNumber;
 private String policyHolderName;
 private LocalDate expiryDate;
 private String coverageType;
 private double premiumAmount;

 // Constructor
 Policy(int policyNumber, String policyHolderName,
        LocalDate expiryDate, String coverageType,
        double premiumAmount) {

     this.policyNumber = policyNumber;
     this.policyHolderName = policyHolderName;
     this.expiryDate = expiryDate;
     this.coverageType = coverageType;
     this.premiumAmount = premiumAmount;
 }

 // Getters
 int getPolicyNumber() {
     return policyNumber;
 }

 String getPolicyHolderName() {
     return policyHolderName;
 }

 LocalDate getExpiryDate() {
     return expiryDate;
 }

 @Override
 public String toString() {
     return policyNumber + " | " + policyHolderName +
            " | " + coverageType +
            " | Expiry: " + expiryDate;
 }
}
