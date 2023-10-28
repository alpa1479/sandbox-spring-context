package edu.sandbox.springcontext.injectiontypes.services.impl;

import edu.sandbox.springcontext.injectiontypes.services.Dependency;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class DependencyImpl implements Dependency {

    @Override
    public void doSomething() {
        log.info(">>>> DependencyImpl.doSomething()");
    }
}
