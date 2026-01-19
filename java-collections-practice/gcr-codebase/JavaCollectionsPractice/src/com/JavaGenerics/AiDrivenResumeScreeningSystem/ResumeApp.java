package com.JavaGenerics.AiDrivenResumeScreeningSystem;

import java.util.ArrayList;
import java.util.List;

class ResumeApp {

    public static void main(String[] args) {

        // Create resumes
        Resume<SoftwareEngineer> r1 =
                new Resume<>(new SoftwareEngineer("Abhishek"));

        Resume<DataScientist> r2 =
                new Resume<>(new DataScientist("Rajeev"));

        Resume<ProductManager> r3 =
                new Resume<>(new ProductManager("Rahul"));

        // Process resumes using generic method
        ResumeProcessor.processResume(r1.getJobRole());
        ResumeProcessor.processResume(r2.getJobRole());
        ResumeProcessor.processResume(r3.getJobRole());

        // Screening pipeline
        List<JobRole> pipeline = new ArrayList<>();
        pipeline.add(r1.getJobRole());
        pipeline.add(r2.getJobRole());
        pipeline.add(r3.getJobRole());

        System.out.println("=== Screening Pipeline ===");
        ScreeningPipeline.screenResumes(pipeline);
    }
}
