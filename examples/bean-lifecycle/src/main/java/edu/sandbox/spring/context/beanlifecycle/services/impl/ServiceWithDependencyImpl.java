package edu.sandbox.spring.context.beanlifecycle.services.impl;

import edu.sandbox.spring.context.beanlifecycle.services.Dependency;
import edu.sandbox.spring.context.beanlifecycle.services.ServiceWithDependency;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Slf4j
public class ServiceWithDependencyImpl implements ServiceWithDependency,
        BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean, SmartInitializingSingleton {

    private Dependency dependency;

    public ServiceWithDependencyImpl(Dependency dependency, String propertyFromConfiguration) {
        log.info(">>>> Step 1: Instantiation and properties population, [dependency = {}, propertyFromConfiguration = {}]",
                dependency.getClass().getSimpleName(),
                propertyFromConfiguration
        );
        this.dependency = dependency;
    }

    @Override
    public void setBeanName(String name) {
        log.info(">>>> Step 2: BeanNameAware, [name = {}]", name);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        log.info(">>>> Step 3: BeanFactoryAware, [beanFactory = {}]", beanFactory.getClass().getSimpleName());
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        log.info(">>>> Step 4: ApplicationContextAware, [applicationContext = {}]", applicationContext.getClass().getSimpleName());
    }

    @PostConstruct
    public void postConstructInitMethod() {
        log.info(">>>> Step 6: @PostConstruct");
    }

    @Override
    public void afterPropertiesSet() {
        log.info(">>>> Step 7: InitializingBean.afterPropertiesSet");
    }

    public void customInit() {
        log.info(">>>> Step 8: customInit()");
    }

    @PreDestroy
    public void preDestroyMethod() {
        log.info(">>>> Step 11: @PreDestroy");
    }

    @Override
    public void destroy() {
        log.info(">>>> Step 12: DisposableBean.destroy");
    }

    public void customDestroy() {
        log.info(">>>> Step 13: customDestroy()");
    }

    @Override
    public void doSomething() {
        log.info(">>>> Usage of ServiceWithDependencyImpl.doSomething()");
    }

    @Override
    public void afterSingletonsInstantiated() {
        log.info(">>>> Step 10: SmartInitializingSingleton.afterSingletonsInstantiated");
    }
}
