package com.itheima.executor;

import com.itheima.pojo.Configuration;
import com.itheima.pojo.MappedStatement;

import java.sql.SQLException;
import java.util.List;

public interface Executor { 

    <E> List<E> query(Configuration configuration, MappedStatement mappedStatement, Object param) throws Exception;

    void close();
}
