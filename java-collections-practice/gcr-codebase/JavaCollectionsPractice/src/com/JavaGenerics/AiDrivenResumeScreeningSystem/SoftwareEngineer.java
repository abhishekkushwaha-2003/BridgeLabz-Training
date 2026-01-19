package com.JavaGenerics.AiDrivenResumeScreeningSystem;

class SoftwareEngineer extends JobRole {

    public SoftwareEngineer(String name) {
        super(name);
    }

    @Override
    public String getRequiredSkill() {
        return "Java / DSA";
    }
}
