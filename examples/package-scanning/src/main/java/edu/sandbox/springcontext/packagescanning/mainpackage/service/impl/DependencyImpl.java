package edu.sandbox.springcontext.packagescanning.mainpackage.service.impl;

import edu.sandbox.springcontext.packagescanning.mainpackage.service.Dependency;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DependencyImpl implements Dependency {

    private static final Logger log = LoggerFactory.getLogger(DependencyImpl.class);

    @Override
    public void doSomething() {
        log.info(">>>> doSomething from DependencyImpl");
    }
}
