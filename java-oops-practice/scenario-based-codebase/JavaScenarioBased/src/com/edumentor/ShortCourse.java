package com.edumentor;

//short course learner

public class ShortCourse implements ICertifiable{
	
	@Override
    public void generateCertificate() {
        System.out.println("Generating SIMPLE certificate for Short Course.");
    }
		
}