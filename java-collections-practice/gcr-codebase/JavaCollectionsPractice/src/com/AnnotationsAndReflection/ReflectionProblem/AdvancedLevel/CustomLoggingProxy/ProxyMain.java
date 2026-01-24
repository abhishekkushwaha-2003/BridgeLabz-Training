package com.AnnotationsAndReflection.ReflectionProblem.AdvancedLevel.CustomLoggingProxy;

import java.lang.reflect.Proxy;

public class ProxyMain {
    public static void main(String[] args) {

        Greeting obj = new Hello();

        Greeting proxy = (Greeting) Proxy.newProxyInstance(
                obj.getClass().getClassLoader(),
                new Class[]{Greeting.class},
                new LoggingHandler(obj)
        );

        proxy.sayHello();
    }
}
