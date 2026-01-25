package com.AnnotationsAndReflection.ReflectionProblem.AdvancedLevel.MethodExecutionTiming;

public class TimingMain {
    public static void main(String[] args) throws Exception {

        Task task = new Task();
        TimingUtil.execute(task, "process");
    }
}
