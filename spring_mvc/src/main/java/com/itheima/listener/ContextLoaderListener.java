package com.itheima.listener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @program: spring_mvc
 * @description: TODO
 * @author: Xiaofei Wang
 * @created: 2020/08/02 15:54
 */


public class ContextLoaderListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext servletContext = sce.getServletContext();
        String contextConfigLocation = servletContext.getInitParameter("contextConfigLocation");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(contextConfigLocation);
        //将Spring上下文对象存储到ServletContext域中
        servletContext.setAttribute("app",applicationContext);
        System.out.println("Spring容器创建完毕......");
    }

    public void contextDestroyed(ServletContextEvent sce) {

    }
}
