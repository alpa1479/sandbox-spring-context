package edu.sandbox.springcontext.annotationbasedconfiguration.services.impl;

import edu.sandbox.springcontext.annotationbasedconfiguration.services.impl.AnnotationBasedServiceImpl;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        AnnotationBasedServiceImpl.class
})
public class TestConfig {
}
