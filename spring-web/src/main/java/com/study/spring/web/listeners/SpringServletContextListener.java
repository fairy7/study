package com.study.spring.web.listeners;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.security.provider.PolicySpiFile;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class SpringServletContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        //1.获取spring配置文件的名称
        ServletContext servletContext = sce.getServletContext();
        String config = servletContext.getInitParameter("configLocation");

        //2.创建spring容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);

        //3.把IOC容器放在ServletContext的一个属性中
        servletContext.setAttribute("ApplicationContext", ctx);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
