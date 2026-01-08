package com.loanbuddy;

//Interface defining loan approval behavior
public interface IApprovable {

 // Method to approve or reject loan
 boolean approveLoan();

 // Method to calculate EMI amount
 double calculateEMI();
}
