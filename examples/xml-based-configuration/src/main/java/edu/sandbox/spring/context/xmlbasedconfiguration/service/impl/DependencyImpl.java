package edu.sandbox.spring.context.xmlbasedconfiguration.service.impl;

import edu.sandbox.spring.context.xmlbasedconfiguration.service.Dependency;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DependencyImpl implements Dependency {

    private static final Logger log = LoggerFactory.getLogger(DependencyImpl.class);

    @Override
    public void doSomething() {
        log.info(">>>> doSomething from DependencyServiceImpl");
    }
}
