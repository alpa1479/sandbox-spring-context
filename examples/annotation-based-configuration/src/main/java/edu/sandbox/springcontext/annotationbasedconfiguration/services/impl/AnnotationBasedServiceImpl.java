package edu.sandbox.springcontext.annotationbasedconfiguration.services.impl;

import edu.sandbox.springcontext.annotationbasedconfiguration.services.AnnotationBasedService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AnnotationBasedServiceImpl implements AnnotationBasedService {

    @Override
    public void doSomething() {
        log.info(">>>> AnnotationBasedServiceImpl.doSomething()");
    }
}
