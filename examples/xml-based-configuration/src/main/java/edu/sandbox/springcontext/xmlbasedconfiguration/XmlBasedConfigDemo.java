package edu.sandbox.springcontext.xmlbasedconfiguration;

import edu.sandbox.springcontext.xmlbasedconfiguration.service.XmlBasedService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlBasedConfigDemo {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        XmlBasedService bean = context.getBean(XmlBasedService.class);
        bean.doSomething();
    }
}
