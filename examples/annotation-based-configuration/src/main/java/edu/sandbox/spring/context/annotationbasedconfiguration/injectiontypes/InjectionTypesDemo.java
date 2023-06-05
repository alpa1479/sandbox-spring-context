package edu.sandbox.spring.context.annotationbasedconfiguration.injectiontypes;

import edu.sandbox.spring.context.annotationbasedconfiguration.injectiontypes.services.ServiceWithDependency;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class InjectionTypesDemo {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(InjectionTypesDemo.class);
        context.getBean(ServiceWithDependency.class).doSomething();
    }
}

