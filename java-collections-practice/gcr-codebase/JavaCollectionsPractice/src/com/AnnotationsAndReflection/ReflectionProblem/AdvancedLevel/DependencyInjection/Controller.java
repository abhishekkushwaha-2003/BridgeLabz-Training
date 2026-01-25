package com.AnnotationsAndReflection.ReflectionProblem.AdvancedLevel.DependencyInjection;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class Controller {

    @Inject
    Service service;

    public void run() {
        service.work();
    }
}
