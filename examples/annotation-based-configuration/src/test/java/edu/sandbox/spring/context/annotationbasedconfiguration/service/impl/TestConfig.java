package edu.sandbox.spring.context.annotationbasedconfiguration.service.impl;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        CircularDependencyImpl.class,
        DependencyImpl.class
})
public class TestConfig {
}
