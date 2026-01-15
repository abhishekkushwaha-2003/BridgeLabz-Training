package com.birdsanctuary;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Custom annotation
@Retention(RetentionPolicy.RUNTIME)
public @interface DeveloperInfo {
    String developerName();
    String version();
}
