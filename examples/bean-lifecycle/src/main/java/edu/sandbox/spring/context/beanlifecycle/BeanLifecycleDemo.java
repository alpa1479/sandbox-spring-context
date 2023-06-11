package edu.sandbox.spring.context.beanlifecycle;

import edu.sandbox.spring.context.beanlifecycle.services.ServiceWithDependency;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class BeanLifecycleDemo {

    // AnnotatedBeanDefinitionReader.doRegisterBean will initiate creation of BeanDefinitions starting from BeanLifecycleDemo
    // ClassPathBeanDefinitionScanner.doScan method will create BeanDefinitions as a result of package scanning
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(BeanLifecycleDemo.class);
        context.getBean(ServiceWithDependency.class).doSomething();
        context.registerShutdownHook(); // to gracefully shut down application, and invoke destroy methods
    }
}

