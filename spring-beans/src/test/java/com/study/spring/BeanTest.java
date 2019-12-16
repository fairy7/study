package com.study.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest {

    @Test
    public void test() {
        System.out.println("start");
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        System.out.println("inter");
        ApplicationContext context_ = new ClassPathXmlApplicationContext("spring.xml");
        System.out.println("end");
        Bean bean = context.getBean("bean", com.study.spring.Bean.class);
        Bean bean11 = context_.getBean("bean", com.study.spring.Bean.class);
        System.out.println("bean : " + bean.toString());
        System.out.println("bean11 : " + bean11.toString());
        Bean2 bean2 = context.getBean("bean2", com.study.spring.Bean2.class);
        Bean2 bean22 = context_.getBean("bean2", com.study.spring.Bean2.class);
        System.out.println("bean2 : " + bean2.toString());
        System.out.println("bean22 : " + bean22.toString());
        Bean3 bean3 = context.getBean("bean3", com.study.spring.Bean3.class);
        Bean3 bean33 = context_.getBean("bean3", com.study.spring.Bean3.class);
        System.out.println("bean3 : " + bean3.toString());
        System.out.println("bean3 3: " + bean33.toString());
        System.out.println("2 ^ 16 = " + (1 << 16));
        System.out.println("byte  1 2 ^ 7 = " + (1 << 7));
        System.out.println("short 2 2 ^ 15 = " + (1 << 15));
        System.out.println("int   4 2 ^ 31 = " + (1 << 31));
        System.out.println("long  8 2 ^ 63 = " + (long)(1 << 63));
        System.out.println((char)97);

        double max = 0;
        for (int i = 0; i < 32; i++) {
            double atack = (3002 + 150 + 180 * i) * (1.5 + 0.07 * (34 - i));
            if (atack > max) {
                max = atack;
                System.out.println( i + " : " + atack);
            }
        }
        int num;
        Bean b;
        /*for (int i = 0; i < (1 << 16) - 1; i++) {
            System.out.print((char)i);
            if (i % (1 << 4) == 0) {
                System.out.print('\n');
            } else {
                System.out.print(' ');
            }
        }*/
    }

    public static double max(double[] arr) {
        double max = 0;
        if (arr == null || arr.length == 0) {
            return max;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
                System.out.println( i + " : " + max);
            }
        }
        return max;
    }
}
