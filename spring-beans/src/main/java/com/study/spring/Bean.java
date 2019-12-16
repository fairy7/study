package com.study.spring;

import java.util.concurrent.locks.ReentrantLock;

public class Bean extends ReentrantLock {
    public Bean(){
        System.out.println("a new bean");
    }

}
