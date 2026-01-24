package com.AnnotationsAndReflection.ReflectionProblem.AdvancedLevel.GenerateSONRepresentation;

import java.lang.reflect.Field;

public class JsonUtil {

    public static String toJson(Object obj) throws Exception {

        Class<?> cls = obj.getClass();
        Field[] fields = cls.getDeclaredFields();

        String json = "{";

        for (int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(true);

            json += "\"" + fields[i].getName() + "\":\"" 
                    + fields[i].get(obj) + "\"";

            if (i < fields.length - 1) {
                json += ", ";
            }
        }
        json += "}";
        return json;
    }
}
