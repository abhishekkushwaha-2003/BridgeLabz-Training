package com.AnnotationsAndReflection.ReflectionProblem.AdvancedLevel.CustomObjectMapper;

import java.lang.reflect.Field;
import java.util.Map;

public class ObjectMapperUtil {

    public static <T> T toObject(Class<T> clazz, Map<String, Object> data) throws Exception {

        // create object dynamically
        T obj = clazz.getDeclaredConstructor().newInstance();

        // loop through map
        for (String key : data.keySet()) {
            Field field = clazz.getDeclaredField(key);
            field.setAccessible(true);
            field.set(obj, data.get(key));
        }
        return obj;
    }
}

