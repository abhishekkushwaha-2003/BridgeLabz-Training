package com.JavaGenerics.AiDrivenResumeScreeningSystem;

class ResumeProcessor {

    // Generic method to process any resume
    public static <T extends JobRole> void processResume(T role) {

        System.out.println("Candidate: " + role.getCandidateName());
        System.out.println("Applied For Skill: " + role.getRequiredSkill());
        System.out.println("Resume Processed Successfully");
        System.out.println("--------------------------------");
    }
}
