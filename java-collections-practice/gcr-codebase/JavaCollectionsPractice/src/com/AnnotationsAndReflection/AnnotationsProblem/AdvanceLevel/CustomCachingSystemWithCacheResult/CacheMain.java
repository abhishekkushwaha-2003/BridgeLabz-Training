package com.AnnotationsAndReflection.AnnotationsProblem.AdvanceLevel.CustomCachingSystemWithCacheResult;

public class CacheMain {
    public static void main(String[] args) throws Exception {

        MathService service = new MathService();

        System.out.println(CacheManager.invoke(service, "square", 5));
        System.out.println(CacheManager.invoke(service, "square", 5)); // cached
    }
}
