package com.itheima.sqlSession;

import com.itheima.config.XMLConfigBuilder;
import com.itheima.pojo.Configuration;
import org.dom4j.DocumentException;

import java.io.InputStream;

public class SqlSessionFactoryBuilder {

    /**
     * 1.解析配置文件，封装容器对象  2.创建SqlSessionFactory工厂对象
     * @param inputStream
     * @return
     */
    public SqlSessionFactory build(InputStream inputStream) throws DocumentException {

        // 1.解析配置文件，封装容器对象 XMLConfigBuilder:专门解析核心配置文件的解析类
        XMLConfigBuilder xmlConfigBuilder = new XMLConfigBuilder();
        Configuration configuration =  xmlConfigBuilder.parse(inputStream);

        // 2.创建SqlSessionFactory工厂对象
        return new DefaultSqlSessionFactory(configuration);


    }


}
