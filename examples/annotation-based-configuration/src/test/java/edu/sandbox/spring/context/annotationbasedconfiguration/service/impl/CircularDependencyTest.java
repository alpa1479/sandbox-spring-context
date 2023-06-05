package edu.sandbox.spring.context.annotationbasedconfiguration.service.impl;

import edu.sandbox.spring.context.annotationbasedconfiguration.services.CircularDependency;
import edu.sandbox.spring.context.annotationbasedconfiguration.services.impl.CircularDependencyImpl;
import edu.sandbox.spring.context.annotationbasedconfiguration.services.impl.DependencyImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig({ // approach with list of classes, we should specify implementations
        CircularDependencyImpl.class,
        DependencyImpl.class
})
@DisplayName("Test should check that CircularDependency initialized properly")
class CircularDependencyTest {

    @Autowired
    private CircularDependency circularDependency;

    @Test
    @DisplayName("should check that circularDependency is not null")
    void shouldCheckThatObjectNonNull() {
        Assertions.assertThat(circularDependency).isNotNull();
    }
}
