package com.itheima;

import org.junit.Test;


/**
 * @program: JdbcUtils
 * @description: Druid连接池使用Demo
 * @author: Xiaofei Wang
 * @created: 2020/07/30 17:59
 */


public class DruidTest {

    @Test
    public void testUpdate() throws Exception {
        int update = CRUDUtils.update("update account set money=? where id=?",2000,2);
        System.out.println(update);
    }
}
