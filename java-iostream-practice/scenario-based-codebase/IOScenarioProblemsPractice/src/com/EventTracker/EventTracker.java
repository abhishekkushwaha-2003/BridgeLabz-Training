package com.EventTracker;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.util.*;

public class EventTracker {

    public static void main(String[] args) throws Exception {

        Class<?> clazz = UserService.class;
        List<Map<String, Object>> auditLogs = new ArrayList<>();

        for (Method method : clazz.getDeclaredMethods()) {

            if (method.isAnnotationPresent(AuditTrail.class)) {

                AuditTrail audit = method.getAnnotation(AuditTrail.class);

                Map<String, Object> log = new LinkedHashMap<>();
                log.put("class", clazz.getSimpleName());
                log.put("method", method.getName());
                log.put("action", audit.action());
                log.put("timestamp", LocalDateTime.now().toString());

                auditLogs.add(log);
            }
        }

        ObjectMapper mapper = new ObjectMapper();
        mapper.writerWithDefaultPrettyPrinter()
              .writeValue(new java.io.File("audit-log.json"), auditLogs);

        System.out.println("Audit log generated");
    }
}
