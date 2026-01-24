package com.AnnotationsAndReflection.ReflectionProblem.IntermediateLevel.AccessAndModifyStaticFields;

import java.lang.reflect.Field;

public class ConfigurationMain {
    public static void main(String[] args) throws Exception {

        // show old value
        Configuration.showKey();

        Class<?> cls = Configuration.class;

        // access private static field
        Field field = cls.getDeclaredField("API_KEY");
        field.setAccessible(true);

        // modify static field
        field.set(null, "NEW_SECRET_KEY");

        // show new value
        Configuration.showKey();
    }
}
