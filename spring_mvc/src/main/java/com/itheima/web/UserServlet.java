package com.itheima.web;

import com.itheima.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @program: spring_mvc
 * @description: TODO
 * @author: Xiaofei Wang
 * @created: 2020/08/02 15:35
 */


public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取全局域对象,req.getServletContext()也可以
        ServletContext servletContext = this.getServletContext();
        //获取Spring容器
        ApplicationContext app = WebApplicationContextUtils.getWebApplicationContext(servletContext);
        //获取bean对象
        UserService userService = app.getBean("userService", UserService.class);
        //执行方法
        userService.save();
    }
}
