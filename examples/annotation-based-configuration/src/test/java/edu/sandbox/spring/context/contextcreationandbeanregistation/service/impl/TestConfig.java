package edu.sandbox.spring.context.contextcreationandbeanregistation.service.impl;

import edu.sandbox.spring.context.annotationbasedconfiguration.contextcreationandbeanregistation.services.impl.AnnotationBasedServiceImpl;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        AnnotationBasedServiceImpl.class
})
public class TestConfig {
}
