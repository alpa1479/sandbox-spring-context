package edu.sandbox.springcontext.javabasedconfiguration.service.impl;

import edu.sandbox.springcontext.javabasedconfiguration.service.Dependency;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DependencyImpl implements Dependency {

    private static final Logger log = LoggerFactory.getLogger(DependencyImpl.class);

    @Override
    public void doSomething() {
        log.info(">>>> doSomething from DependencyImpl");
    }
}
