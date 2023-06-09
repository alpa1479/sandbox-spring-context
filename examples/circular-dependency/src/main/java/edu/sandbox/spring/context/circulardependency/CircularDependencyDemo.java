package edu.sandbox.spring.context.circulardependency;

import edu.sandbox.spring.context.circulardependency.services.FirstDependency;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class CircularDependencyDemo {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(CircularDependencyDemo.class);
        context.getBean(FirstDependency.class).doSomething();
    }
}

