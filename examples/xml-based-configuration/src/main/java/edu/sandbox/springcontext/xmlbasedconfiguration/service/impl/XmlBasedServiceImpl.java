package edu.sandbox.springcontext.xmlbasedconfiguration.service.impl;

import edu.sandbox.springcontext.xmlbasedconfiguration.service.Dependency;
import edu.sandbox.springcontext.xmlbasedconfiguration.service.XmlBasedService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//@RequiredArgsConstructor
public class XmlBasedServiceImpl implements XmlBasedService {

    private static final Logger log = LoggerFactory.getLogger(XmlBasedServiceImpl.class);

    private final Dependency dependency;

    // for constructor injection
    public XmlBasedServiceImpl(Dependency dependency) {
        this.dependency = dependency;
    }

    // for setter injection
//    public void setDependency(Dependency dependency) {
//        this.dependency = dependency;
//    }

    @Override
    public void doSomething() {
        dependency.doSomething();
        log.info(">>>> doSomething from XmlBasedServiceImpl");
    }
}
