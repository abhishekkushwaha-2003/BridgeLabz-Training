package com.skillforge;

// Student class
public class Student extends User {

    // Course completion progress (percentage)
    private int progress;

    public Student(String name) {
        super(name);
        this.progress = 0;
    }

    // Progress calculation using operators
    public void updateProgress(int completedModules, int totalModules) {
        this.progress = (completedModules * 100) / totalModules;
    }

    public int getProgress() {
        return progress;
    }
}
