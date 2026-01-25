package com.AnnotationsAndReflection.ReflectionProblem.AdvancedLevel.DependencyInjection;

import java.lang.reflect.Field;

public class DIContainer {

    public static void inject(Object obj) throws Exception {

        Class<?> cls = obj.getClass();

        for (Field field : cls.getDeclaredFields()) {
            if (field.isAnnotationPresent(Inject.class)) {

                field.setAccessible(true);
                Object dependency = field.getType()
                        .getDeclaredConstructor().newInstance();

                field.set(obj, dependency);
            }
        }
    }
}
