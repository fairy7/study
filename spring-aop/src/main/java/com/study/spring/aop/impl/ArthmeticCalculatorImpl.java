package com.study.spring.aop.impl;

import org.springframework.stereotype.Component;

@Component
public class ArthmeticCalculatorImpl implements ArthmeticCalculator {
    @Override
    public int add(int x, int y) {
        return x + y;
    }

    @Override
    public int sub(int x, int y) {
        return x - y;
    }

    @Override
    public int mul(int x, int y) {
        return x * y;
    }

    @Override
    public int div(int x, int y) {
        return x / y;
    }
}
