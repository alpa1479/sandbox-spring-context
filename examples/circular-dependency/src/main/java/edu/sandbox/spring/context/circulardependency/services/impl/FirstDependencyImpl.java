package edu.sandbox.spring.context.circulardependency.services.impl;

import edu.sandbox.spring.context.circulardependency.services.FirstDependency;
import edu.sandbox.spring.context.circulardependency.services.SecondDependency;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class FirstDependencyImpl implements FirstDependency {

    private SecondDependency secondDependency;

    public FirstDependencyImpl(SecondDependency secondDependency) {
        this.secondDependency = secondDependency;
    }

    // One possible fix for circular reference exception - use setter injection instead of constructor
    // public FirstDependencyImpl() {}

    // @Autowired
    // public void setSecondDependency(SecondDependency secondDependency) {
    //     this.secondDependency = secondDependency;
    // }

    @Override
    public void doSomething() {
        // prints:
        // >>>> call from SecondDependencyImpl.doSomething() -> FirstDependencyImpl.doNothing()
        // >>>> SecondDependencyImpl.doSomething()
        secondDependency.doSomething();

        log.info(">>>> FirstDependencyImpl.doSomething()");
    }

    @Override
    public void doNothing(String message) {
        log.info(">>>> call from {} -> FirstDependencyImpl.doNothing()", message);
    }
}
