package edu.sandbox.spring.context.annotationbasedconfiguration.services.impl;

import edu.sandbox.spring.context.annotationbasedconfiguration.services.CircularDependency;
import edu.sandbox.spring.context.annotationbasedconfiguration.services.Dependency;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor // will create constructor with final variables which will be enough for Spring to required inject beans
public class DependencyImpl implements Dependency {

    private final CircularDependency circularDependency;

    @Override
    public void doSomething() {
        circularDependency.doSomething();
        log.info(">>>> DependencyImpl.doSomething()");
    }

    @Override
    public void doNothing() {
        log.info(">>>> DependencyImpl.doNothing()");
    }
}
