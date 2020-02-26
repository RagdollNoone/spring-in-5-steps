package com.demo.spring.springin5steps.cdi;

import javax.inject.Named;

@Named
public class SomeCDIDAO {
    public SomeCDIDAO() {
        System.out.println("SomeCDIDAO");
    }
}
