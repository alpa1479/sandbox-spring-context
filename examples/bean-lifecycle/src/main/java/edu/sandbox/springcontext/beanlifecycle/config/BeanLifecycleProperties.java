package edu.sandbox.springcontext.beanlifecycle.config;

import edu.sandbox.springcontext.beanlifecycle.services.Dependency;
import edu.sandbox.springcontext.beanlifecycle.services.ServiceWithDependency;
import edu.sandbox.springcontext.beanlifecycle.services.impl.ServiceWithDependencyImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class BeanLifecycleProperties {

    @Bean(initMethod = "customInit", destroyMethod = "customDestroy")
    public ServiceWithDependency serviceWithDependency(Dependency dependency,
                                                       @Value("${property.from.configuration}") String propertyFromConfiguration) {
        return new ServiceWithDependencyImpl(dependency, propertyFromConfiguration);
    }
}
