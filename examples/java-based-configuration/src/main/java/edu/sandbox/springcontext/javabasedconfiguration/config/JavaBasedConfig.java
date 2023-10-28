package edu.sandbox.springcontext.javabasedconfiguration.config;

import edu.sandbox.springcontext.javabasedconfiguration.service.Dependency;
import edu.sandbox.springcontext.javabasedconfiguration.service.JavaBasedConfigService;
import edu.sandbox.springcontext.javabasedconfiguration.service.impl.DependencyImpl;
import edu.sandbox.springcontext.javabasedconfiguration.service.impl.JavaBasedConfigServiceImpl;
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
