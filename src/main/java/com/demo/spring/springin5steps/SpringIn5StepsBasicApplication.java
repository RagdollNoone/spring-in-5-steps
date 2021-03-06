package com.demo.spring.springin5steps;

import com.demo.spring.springin5steps.basic.BinarySearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
@Configuration
@ComponentScan("com.demo.spring.springin5steps.basic")
public class SpringIn5StepsBasicApplication {

    public static void main(String[] args) {
//        ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsBasicApplication.class, args);

        try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsBasicApplication.class)) {

            BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
            BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);

            System.out.println(binarySearch);
            System.out.println(binarySearch1);

            int result = binarySearch.binarySearch(new int[]{12, 4, 6}, 3);
            int result1 = binarySearch1.binarySearch(new int[]{12, 4, 6}, 3);

            System.out.println(result);
            System.out.println(result1);
        }
    }
}
