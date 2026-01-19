package com.JavaGenerics.AiDrivenResumeScreeningSystem;

class ProductManager extends JobRole {

    public ProductManager(String name) {
        super(name);
    }

    @Override
    public String getRequiredSkill() {
        return "Product Strategy";
    }
}
