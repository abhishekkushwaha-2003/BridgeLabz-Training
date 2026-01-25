package com.AnnotationsAndReflection.AnnotationsProblem.AdvanceLevel.CustomSerializationAnnotationJsonField;

import java.lang.reflect.Field;

public class JsonConverter {

    public static String toJson(Object obj) throws Exception {

        Class<?> cls = obj.getClass();
        Field[] fields = cls.getDeclaredFields();

        String json = "{";

        for (int i = 0; i < fields.length; i++) {

            fields[i].setAccessible(true);

            if (fields[i].isAnnotationPresent(JsonField.class)) {

                JsonField jf = fields[i].getAnnotation(JsonField.class);

                json += "\"" + jf.name() + "\":\"" + fields[i].get(obj) + "\"";

                if (i < fields.length - 1) {
                    json += ", ";
                }
            }
        }

        json += "}";
        return json;
    }
}
