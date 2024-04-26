package com.itheima.io;

import java.io.InputStream;

public class Resources {

    /**
     * 根据配置文件的路径，加载配置文件成字节输入流，存到内存中 没有解析
     * @param path
     * @return
     */
    public static InputStream getResourceAsSteam(String path){
        InputStream resourceAsStream = Resources.class.getClassLoader().getResourceAsStream(path);//类加载器
        return resourceAsStream;
    }
}
