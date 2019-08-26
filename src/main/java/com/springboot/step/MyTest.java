package com.springboot.step;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;


public class MyTest {
    String resource = "org/mybatis/example/mybatis-config.xml";
    @Test
    public void test(){
        try {
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory  sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            System.out.println(sqlSessionFactory);
        }
        catch (Exception e){

        }
    }
}
