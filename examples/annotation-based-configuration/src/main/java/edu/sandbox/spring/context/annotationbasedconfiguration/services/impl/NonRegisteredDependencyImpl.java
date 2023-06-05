package edu.sandbox.spring.context.annotationbasedconfiguration.services.impl;

import edu.sandbox.spring.context.annotationbasedconfiguration.services.NonRegisteredDependency;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NonRegisteredDependencyImpl implements NonRegisteredDependency {

    @Override
    public void doSomething() {
        log.info(">>>> NonRegisteredDependencyImpl.doSomething()");
    }
}
