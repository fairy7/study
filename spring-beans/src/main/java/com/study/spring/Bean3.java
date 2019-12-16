package com.study.spring;

import java.util.concurrent.locks.ReentrantLock;

public class Bean3 extends ReentrantLock {
    public Bean3(){
        System.out.println("a new bean3");
    }

}
