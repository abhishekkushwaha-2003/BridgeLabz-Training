package com.objectmodelingandobjectdiagram.assistedproblem;

public class Association {
	    public static void main(String[] args) {

	        // creating Bank object
	        Bank sbi = new Bank("State Bank of India");

	        // creating Customer objects
	        Customer c1 = new Customer("Rohan", 5000, sbi);
	        Customer c2 = new Customer("Amit", 10000, sbi);

	        // opening accounts in bank
	        sbi.openAccount(c1);
	        sbi.openAccount(c2);

	        // customers viewing balance
	        System.out.println();
	        c1.viewBalance();
	        System.out.println();
	        c2.viewBalance();
	    }
	}

