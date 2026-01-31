package com.LambdaExpression.BasicProblems;

@FunctionalInterface
interface LightAction {
    void activate();
}

public class SmartHomeLightingAutomation {
    public static void main(String[] args) {

       
        LightAction motionTrigger =
                () -> System.out.println("Lights ON with bright white color");

        
        LightAction nightTrigger =
                () -> System.out.println("Lights ON with dim warm color");

        
        LightAction voiceTrigger =
                () -> System.out.println("Lights ON with party mode");

        motionTrigger.activate();
        nightTrigger.activate();
        voiceTrigger.activate();
    }
}
