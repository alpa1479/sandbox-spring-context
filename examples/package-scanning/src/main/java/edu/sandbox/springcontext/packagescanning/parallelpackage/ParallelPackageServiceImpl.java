package edu.sandbox.springcontext.packagescanning.parallelpackage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ParallelPackageServiceImpl implements ParallelPackageService {

    private static final Logger log = LoggerFactory.getLogger(ParallelPackageServiceImpl.class);

    @Override
    public void doSomething() {
        log.info(">>>> doSomething from ParallelPackageServiceImpl");
    }
}
