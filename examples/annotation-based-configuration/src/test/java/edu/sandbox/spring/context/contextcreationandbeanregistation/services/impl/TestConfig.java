package edu.sandbox.spring.context.contextcreationandbeanregistation.services.impl;

import edu.sandbox.spring.context.annotationbasedconfiguration.services.impl.AnnotationBasedServiceImpl;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        AnnotationBasedServiceImpl.class
})
public class TestConfig {
}
