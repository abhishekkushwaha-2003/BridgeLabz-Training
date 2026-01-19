package com.collection.ScenarioBased.InsurancePolicyManagementSystem;

import java.time.LocalDate;

//Policy class
class Policy {

 private int policyNumber;          // unique
 private String policyHolderName;
 private LocalDate expiryDate;
 private String coverageType;
 private double premiumAmount;

 // Constructor
 public Policy(int policyNumber, String name,
               LocalDate expiryDate,
               String coverageType,
               double premiumAmount) {

     this.policyNumber = policyNumber;
     this.policyHolderName = name;
     this.expiryDate = expiryDate;
     this.coverageType = coverageType;
     this.premiumAmount = premiumAmount;
 }

 // Getters
 public int getPolicyNumber() {
     return policyNumber;
 }

 public String getPolicyHolderName() {
     return policyHolderName;
 }

 public LocalDate getExpiryDate() {
     return expiryDate;
 }

 public String getCoverageType() {
     return coverageType;
 }

 public double getPremiumAmount() {
     return premiumAmount;
 }

 // Used by HashSet & LinkedHashSet for uniqueness
 @Override
 public boolean equals(Object obj) {
     if (this == obj) return true;
     if (!(obj instanceof Policy)) return false;
     Policy p = (Policy) obj;
     return this.policyNumber == p.policyNumber;
 }

 @Override
 public int hashCode() {
     return policyNumber;
 }

 @Override
 public String toString() {
     return policyNumber + " | " + policyHolderName +
            " | " + coverageType +
            " | Expiry: " + expiryDate;
 }
}

