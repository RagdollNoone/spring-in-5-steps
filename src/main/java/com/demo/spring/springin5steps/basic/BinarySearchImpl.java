package com.demo.spring.springin5steps.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Scope("prototype")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    @Qualifier("bubble")
    private SortAlgorithm sortAlgorithm;

    public int binarySearch(int[] numbers, int numberToSearchFor) {
        int[] sortedNumbers = this.sortAlgorithm.sort(numbers);

        System.out.println(this.sortAlgorithm);

        // Implement Search array Logic here

        return 3;
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("BinarySearchImpl postConstruct");
        System.out.println(this.sortAlgorithm);
    }

    @PreDestroy
    public void preDestory() {
        System.out.println("BinarySearchImpl preDestory");
    }
}
