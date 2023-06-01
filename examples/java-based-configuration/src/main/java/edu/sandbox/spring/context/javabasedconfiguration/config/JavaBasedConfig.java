package edu.sandbox.spring.context.javabasedconfiguration.config;

import edu.sandbox.spring.context.javabasedconfiguration.service.JavaBasedConfigService;
import edu.sandbox.spring.context.javabasedconfiguration.service.Dependency;
import edu.sandbox.spring.context.javabasedconfiguration.service.impl.DependencyImpl;
import edu.sandbox.spring.context.javabasedconfiguration.service.impl.JavaBasedConfigServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // will work without this annotation
public class JavaBasedConfig {

    @Bean
    Dependency dependency() {
        return new DependencyImpl();
    }

    // method injection
    @Bean
    JavaBasedConfigService javaBasedConfigService(Dependency dependency) {
        return new JavaBasedConfigServiceImpl(dependency);
    }
}
