package edu.sandbox.spring.context.annotationbasedconfiguration.services.impl;

import edu.sandbox.spring.context.annotationbasedconfiguration.services.AnnotationBasedService;
import edu.sandbox.spring.context.annotationbasedconfiguration.services.Dependency;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
//@RequiredArgsConstructor
public class AnnotationBasedServiceImpl implements AnnotationBasedService {

    // field injection (via reflection)
    //    @Autowired
    private Dependency dependency;

    // constructor injection, will work without @Autowired if we have only 1 constructor
    public AnnotationBasedServiceImpl(Dependency dependency) {
        this.dependency = dependency;
    }

    // setter injection
    //    @Autowired
    //    public void setDependency(Dependency dependency) {
    //        this.dependency = dependency;
    //    }

    @Override
    public void doSomething() {
        dependency.doSomething();
        log.info(">>>> AnnotationBasedServiceImpl.doSomething()");
    }
}
