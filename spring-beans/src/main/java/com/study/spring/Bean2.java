package com.study.spring;

import java.util.concurrent.locks.ReentrantLock;

public class Bean2 extends ReentrantLock {
    public Bean2(){
        System.out.println("a new bean2");
    }
}
