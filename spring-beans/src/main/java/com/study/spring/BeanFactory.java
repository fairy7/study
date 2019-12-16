package com.study.spring;

public class BeanFactory {
    private static Bean2 getBean2() {
        return  new Bean2();
    }
    private Bean3 getBean3() {
        return new Bean3();
    }
    
}
