package com.itheima;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * @program: JdbcUtils
 * @description: 通用的增删改查封装
 * @author: Xiaofei Wang
 * @created: 2020/07/30 18:16
 */


public class CRUDUtils {
    public static int update(String sql, Object... params) {
        try {
            //(1)获取链接
            Connection connection = JdbcDruidUtils.getConnection();
            //(2)执行Sql语句
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            for (int i = 0; i < params.length; i++) {
                preparedStatement.setObject(i + 1, params[i]);
            }
            int effectLine = preparedStatement.executeUpdate();
            return effectLine;
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }
}
