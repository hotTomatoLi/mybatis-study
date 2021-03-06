package com.leegebe.mybatis.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * SqlSessionFactory管理工具
 */
public class SqlSessionFactoryManager {

    private static SqlSessionFactory factory = null;

    private static String fileName = "mybatis-config.xml";

    private SqlSessionFactoryManager(){}

    public static void initMapper(String sqlMapperFileName){
        fileName = sqlMapperFileName;
    }

    public static SqlSessionFactory getFactory() {

        try {
            if(factory == null) {
                //读取默认配置文件
                Reader reader = Resources.getResourceAsReader(fileName);
                SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
                //建立工厂
                factory = builder.build(reader);
                builder = null;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

        return factory;
    }

}
