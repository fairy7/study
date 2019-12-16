package com.study.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

public class JDBCTest {
    private ApplicationContext ctx = null;
    {
        ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    public void testData() throws SQLException {
        DataSource dataSource = ctx.getBean(DataSource.class);
        System.out.println(dataSource.getConnection());


    }
}
