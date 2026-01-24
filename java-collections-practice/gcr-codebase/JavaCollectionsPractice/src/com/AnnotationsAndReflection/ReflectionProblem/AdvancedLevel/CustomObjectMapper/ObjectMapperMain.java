package com.AnnotationsAndReflection.ReflectionProblem.AdvancedLevel.CustomObjectMapper;

import java.util.HashMap;
import java.util.Map;

public class ObjectMapperMain{
    public static void main(String[] args) throws Exception {

        Map<String, Object> map = new HashMap<>();
        map.put("name", "Abhishek");
        map.put("age", 22);

        User user = ObjectMapperUtil.toObject(User.class, map);
        System.out.println(user.name + " " + user.age);
    }
}
