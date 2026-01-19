package com.JavaGenerics.AiDrivenResumeScreeningSystem;

class DataScientist extends JobRole {

    public DataScientist(String name) {
        super(name);
    }

    @Override
    public String getRequiredSkill() {
        return "Python / Machine Learning";
    }
}
