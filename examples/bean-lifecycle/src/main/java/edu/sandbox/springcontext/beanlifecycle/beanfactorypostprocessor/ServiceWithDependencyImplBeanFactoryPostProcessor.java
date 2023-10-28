package edu.sandbox.springcontext.beanlifecycle.beanfactorypostprocessor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ServiceWithDependencyImplBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        // if bean not found it will throw NoSuchBeanDefinitionException
        var beanDefinition = beanFactory.getBeanDefinition("serviceWithDependency");
        log.info(">>>> Step 0: BeanFactoryPostProcessor.postProcessBeanFactory, [beanDefinition = {}]", beanDefinition.getClass().getSimpleName());
    }
}
