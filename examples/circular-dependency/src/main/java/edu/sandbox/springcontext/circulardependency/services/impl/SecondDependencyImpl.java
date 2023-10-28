package edu.sandbox.springcontext.circulardependency.services.impl;

import edu.sandbox.springcontext.circulardependency.services.FirstDependency;
import edu.sandbox.springcontext.circulardependency.services.SecondDependency;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SecondDependencyImpl implements SecondDependency {

    private final FirstDependency firstDependency;

    // Second possible solution - use @Lazy annotation
    // jdk.proxy2.$Proxy9@2052 will be injected instead of FirstDependencyImpl
    // without @Lazy - BeanCurrentlyInCreationException: Error creating bean with name 'secondDependencyImpl': Requested bean is currently in creation: Is there an unresolvable circular reference?
    public SecondDependencyImpl(@Lazy FirstDependency firstDependency) {
        this.firstDependency = firstDependency;
    }

    @Override
    public void doSomething() {
        // firstDependency.doSomething(); // java.lang.StackOverflowError because firstDependency will call secondDependency, and secondDependency will call firstDependency
        firstDependency.doNothing("SecondDependencyImpl.doSomething()");
        log.info(">>>> SecondDependencyImpl.doSomething()");
    }
}
