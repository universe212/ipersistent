package com.itheima.sqlSession;


import com.itheima.executor.Executor;
import com.itheima.executor.SimpleExecutor;
import com.itheima.pojo.Configuration;

public class DefaultSqlSessionFactory implements SqlSessionFactory {

    private Configuration configuration;

    public DefaultSqlSessionFactory(Configuration configuration) {
        this.configuration = configuration;
    }

    @Override
    public SqlSession openSession() {
        // 1.创建执行器对象
        Executor simpleExecutor = new SimpleExecutor();

        // 2.生产sqlSession对象
        DefaultSqlSession defaultSqlSession = new DefaultSqlSession(configuration,simpleExecutor);

        return defaultSqlSession;
    }
}
