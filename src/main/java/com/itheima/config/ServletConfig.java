package com.itheima.config;

//spring整合springMVC
//web容器配置类
//当web容器启动时 会加载下面两个配置类 各自加载各自的bean
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

public class ServletConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMvcConfig.class};
    }

    //springmvc能访问什么取决于后面的{}里的路径
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    //这边可以加个解决中文乱码的过滤器


    @Override
    protected Filter[] getServletFilters() {
        CharacterEncodingFilter filter = new CharacterEncodingFilter();
        filter.setEncoding("UTF-8");
        return new Filter[]{filter};
    }
}
