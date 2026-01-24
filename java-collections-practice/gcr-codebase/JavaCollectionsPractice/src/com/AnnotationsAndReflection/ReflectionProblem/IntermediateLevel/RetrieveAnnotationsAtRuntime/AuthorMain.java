package com.AnnotationsAndReflection.ReflectionProblem.IntermediateLevel.RetrieveAnnotationsAtRuntime;

public class AuthorMain {
    public static void main(String[] args) {

        Class<Book> cls = Book.class;

        // check annotation
        if (cls.isAnnotationPresent(Author.class)) {

            Author author = cls.getAnnotation(Author.class);
            System.out.println("Author Name: " + author.name());
        }
    }
}
