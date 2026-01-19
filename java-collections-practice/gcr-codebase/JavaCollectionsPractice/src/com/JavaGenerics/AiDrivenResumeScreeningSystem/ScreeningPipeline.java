package com.JavaGenerics.AiDrivenResumeScreeningSystem;

import java.util.List;

class ScreeningPipeline {

    // Wildcard method to handle multiple job roles
    public static void screenResumes(List<? extends JobRole> roles) {

        for (JobRole role : roles) {
            System.out.println(
                role.getCandidateName() + " | Skill: " +
                role.getRequiredSkill()
            );
        }
    }
}
