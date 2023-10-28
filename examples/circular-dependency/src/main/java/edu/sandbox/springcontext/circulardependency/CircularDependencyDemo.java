package edu.sandbox.springcontext.circulardependency;

import edu.sandbox.springcontext.circulardependency.services.FirstDependency;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class CircularDependencyDemo {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(CircularDependencyDemo.class);
        context.getBean(FirstDependency.class).doSomething();
    }
}

