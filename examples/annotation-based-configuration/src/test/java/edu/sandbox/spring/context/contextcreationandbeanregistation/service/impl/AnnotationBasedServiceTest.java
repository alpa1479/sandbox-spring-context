package edu.sandbox.spring.context.contextcreationandbeanregistation.service.impl;

import edu.sandbox.spring.context.annotationbasedconfiguration.contextcreationandbeanregistation.services.AnnotationBasedService;
import edu.sandbox.spring.context.annotationbasedconfiguration.contextcreationandbeanregistation.services.impl.AnnotationBasedServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

// @SpringJUnitConfig(TestConfig.class) // approach via config
@SpringJUnitConfig({ // approach with list of classes, we should specify implementations
        AnnotationBasedServiceImpl.class
})
@DisplayName("Test should check that AnnotationBasedService initialized properly")
class AnnotationBasedServiceTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    private AnnotationBasedService annotationBasedService;

    @Test
    @DisplayName("should check that annotationBasedService and applicationContext are not null")
    void shouldCheckThatObjectNonNull() {
        Assertions.assertThat(applicationContext).isNotNull();
        Assertions.assertThat(annotationBasedService).isNotNull();
    }
}
