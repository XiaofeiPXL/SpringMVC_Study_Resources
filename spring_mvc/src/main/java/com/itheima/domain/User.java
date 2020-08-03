package com.itheima.domain;

import java.io.Serializable;

/**
 * @program: spring_mvc
 * @description: TODO
 * @author: Xiaofei Wang
 * @created: 2020/08/02 21:59
 */


public class User implements Serializable {
    private String username;
    private int age;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", age=" + age +
                '}';
    }
}
