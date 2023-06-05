package edu.sandbox.spring.context.annotationbasedconfiguration.contextcreationandbeanregistation.services.impl;

import edu.sandbox.spring.context.annotationbasedconfiguration.contextcreationandbeanregistation.services.AnnotationBasedService;
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
