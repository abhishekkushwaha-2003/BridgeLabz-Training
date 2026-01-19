package com.JavaGenerics.AiDrivenResumeScreeningSystem;

//T must be JobRole or its child
class Resume<T extends JobRole> {

 private T jobRole;

 // Constructor
 public Resume(T jobRole) {
     this.jobRole = jobRole;
 }

 // Getter
 public T getJobRole() {
     return jobRole;
 }
}
