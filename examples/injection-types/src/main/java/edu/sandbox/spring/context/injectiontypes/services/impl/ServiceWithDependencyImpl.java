package edu.sandbox.spring.context.injectiontypes.services.impl;

import edu.sandbox.spring.context.injectiontypes.services.Dependency;
import edu.sandbox.spring.context.injectiontypes.services.InterfaceWithoutImplementation;
import edu.sandbox.spring.context.injectiontypes.services.ServiceWithDependency;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
//@RequiredArgsConstructor // will create constructor with variables that marked as final, spring will use it to inject beans
public class ServiceWithDependencyImpl implements ServiceWithDependency {

    // field injection (via reflection)
    //    @Autowired
    private Dependency dependency;

    // constructor injection, will work without @Autowired if we have only 1 constructor
    public ServiceWithDependencyImpl(Dependency dependency) {
        this.dependency = dependency;
    }

    // We can inject collections:
    // private Set<Dependency> dependencies;
    // public ServiceWithDependencyImpl(Set<Dependency> dependencies) {
    //     this.dependencies = dependencies;
    // }

    // We can inject map (key - bean name, value - bean implementation):
    // private Map<String, Dependency> dependencies;
    // public ServiceWithDependencyImpl(Map<String, Dependency> dependencies) {
    //   this.dependencies = dependencies;
    // }

    // option to mark dependency as optional via field
    @Autowired
    private Optional<InterfaceWithoutImplementation> optionalDependency;

    // option to mark dependency as optional via constructor
    // private InterfaceWithoutImplementation dependencyWithoutImplementation;
    // public ServiceWithDependencyImpl(Optional<InterfaceWithoutImplementation> dependencyWithoutImplementation) {
    //     this.dependencyWithoutImplementation = dependencyWithoutImplementation.orElse(null);
    // }

    // argument will not work, it will fail even if we marked as required = false
    // private InterfaceWithoutImplementation dependencyWithoutImplementation;
    // @Autowired(required = false)
    // public ServiceWithDependencyImpl(InterfaceWithoutImplementation dependencyWithoutImplementation, Dependency dependency) {
    //    this.dependencyWithoutImplementation = dependencyWithoutImplementation;
    //    this.dependency = dependency;
    // }

    // setter injection with argument to make dependency optional
    // @Autowired(required = false)
    // public void setDependency(Dependency dependency) {
    //     this.dependency = dependency;
    // }

    @Override
    public void doSomething() {
        dependency.doSomething();
        log.info(">>>> ServiceWithDependencyImpl.doSomething()");
        log.info(">>>> optionalDependency.isPresent() = {}", optionalDependency.isPresent());
    }
}
