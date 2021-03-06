package com.demo.spring.springin5steps;

import com.demo.spring.springin5steps.cdi.SomeCDIBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsCDIApplication {
    private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsCDIApplication.class);

    public static void main(String[] args) {
        ApplicationContext applicationContext =  SpringApplication.run(SpringIn5StepsCDIApplication.class, args);

        SomeCDIBusiness someCDIBusiness = applicationContext.getBean(SomeCDIBusiness.class);

        LOGGER.info("{}", someCDIBusiness);
    }
}
