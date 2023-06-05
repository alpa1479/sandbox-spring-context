package edu.sandbox.spring.context.annotationbasedconfiguration.circulardependency.services;

public interface FirstDependency {

    void doSomething();

    void doNothing(String message);
}
