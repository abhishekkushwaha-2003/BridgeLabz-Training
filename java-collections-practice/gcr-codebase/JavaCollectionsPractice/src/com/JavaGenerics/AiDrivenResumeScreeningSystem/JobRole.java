package com.JavaGenerics.AiDrivenResumeScreeningSystem;

//Parent class for all job roles
abstract class JobRole {

 private String candidateName;

 // Constructor
 public JobRole(String candidateName) {
     this.candidateName = candidateName;
 }

 // Getter
 public String getCandidateName() {
     return candidateName;
 }

 // Each role defines its own required skill
 public abstract String getRequiredSkill();
}
