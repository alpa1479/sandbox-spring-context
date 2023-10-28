package edu.sandbox.springcontext.packagescanning.mainpackage.service.impl;

import edu.sandbox.springcontext.packagescanning.mainpackage.service.Dependency;
import edu.sandbox.springcontext.packagescanning.mainpackage.service.PackageScanService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PackageScanServiceImpl implements PackageScanService {

    private static final Logger log = LoggerFactory.getLogger(PackageScanServiceImpl.class);

    private final Dependency dependency;

    @Override
    public void doSomething() {
        dependency.doSomething();
        log.info(">>>> doSomething from PackageScanServiceImpl");
    }
}
