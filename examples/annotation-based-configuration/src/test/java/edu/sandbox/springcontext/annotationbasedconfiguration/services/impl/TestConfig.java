package edu.sandbox.springcontext.annotationbasedconfiguration.services.impl;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        AnnotationBasedServiceImpl.class
})
public class TestConfig {
}
