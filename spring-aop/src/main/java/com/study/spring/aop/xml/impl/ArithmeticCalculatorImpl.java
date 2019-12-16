package com.study.spring.aop.xml.impl;

import org.springframework.stereotype.Component;

public class ArithmeticCalculatorImpl implements ArthmeticCalculator {
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
