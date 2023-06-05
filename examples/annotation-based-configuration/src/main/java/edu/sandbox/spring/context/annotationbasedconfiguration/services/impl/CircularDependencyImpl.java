package edu.sandbox.spring.context.annotationbasedconfiguration.services.impl;

import edu.sandbox.spring.context.annotationbasedconfiguration.services.CircularDependency;
import edu.sandbox.spring.context.annotationbasedconfiguration.services.Dependency;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CircularDependencyImpl implements CircularDependency {

    private final Dependency dependency;

    // jdk.proxy2.$Proxy9@2052 will be injected instead of DependencyImpl
    // without @Lazy - Error creating bean with name 'dependencyImpl': Requested bean is currently in creation: Is there an unresolvable circular reference?
    public CircularDependencyImpl(@Lazy Dependency dependency) {
        this.dependency = dependency;
    }

    @Override
    public void doSomething() {
        dependency.doNothing();
        log.info(">>>> CircularDependencyImpl.doSomething()");
    }
}
