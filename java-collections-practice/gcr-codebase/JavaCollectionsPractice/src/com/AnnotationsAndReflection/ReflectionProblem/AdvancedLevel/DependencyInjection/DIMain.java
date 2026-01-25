package com.AnnotationsAndReflection.ReflectionProblem.AdvancedLevel.DependencyInjection;

public class DIMain {
    public static void main(String[] args) throws Exception {

        Controller controller = new Controller();
        DIContainer.inject(controller);

        controller.run();
    }
}
