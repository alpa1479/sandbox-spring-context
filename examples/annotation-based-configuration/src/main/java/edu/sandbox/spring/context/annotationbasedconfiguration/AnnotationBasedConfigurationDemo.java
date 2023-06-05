package edu.sandbox.spring.context.annotationbasedconfiguration;

import edu.sandbox.spring.context.annotationbasedconfiguration.services.AnnotationBasedService;
import edu.sandbox.spring.context.annotationbasedconfiguration.services.NonRegisteredDependency;
import edu.sandbox.spring.context.annotationbasedconfiguration.services.impl.NonRegisteredDependencyImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

// this annotation will indicate Spring to start package scanning from AnnotationBasedConfigDemo location in order to find beans for creation
@ComponentScan
@Slf4j
@RequiredArgsConstructor
public class AnnotationBasedConfigurationDemo {

    public static void main(String[] args) {
        // creating Annotation-based application context and passing class with @ComponentScan annotation
        var context = new AnnotationConfigApplicationContext(AnnotationBasedConfigurationDemo.class);
        var annotationBasedService = context.getBean(AnnotationBasedService.class); // here we are already able to get bean
        annotationBasedService.doSomething();

        // If we want to register bean at runtime
        log.info("-------------------------------- Dynamic bean registration \n");
        NonRegisteredDependency nonRegisteredDependency = new NonRegisteredDependencyImpl();
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
        beanFactory.registerSingleton("nonRegisteredDependency", nonRegisteredDependency);

        // here we are able to get registered bean
        nonRegisteredDependency = (NonRegisteredDependency) context.getBean("nonRegisteredDependency");
        nonRegisteredDependency.doSomething();
    }
}

