package edu.sandbox.spring.context.beanlifecycle.beanpostprocessor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ServiceWithDependencyImplBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if ("serviceWithDependency".equals(beanName)) {
            log.info(">>>> Step 5: BeanPostProcessor.postProcessBeforeInitialization, [beanName = {}]", beanName);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if ("serviceWithDependency".equals(beanName)) {
            log.info(">>>> Step 9: BeanPostProcessor.postProcessAfterInitialization, [beanName = {}]", beanName);
        }
        return bean;
    }
}
