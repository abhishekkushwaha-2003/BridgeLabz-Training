package com.AnnotationsAndReflection.AnnotationsProblem.AdvanceLevel.CustomCachingSystemWithCacheResult;

public class MathService {

    @CacheResult
    public int square(int n) {
        System.out.println("Calculating square...");
        return n * n;
    }
}
