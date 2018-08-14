package com.test.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Description: bean的初始化和销毁
 * @throws
 * @author: liuyongheng
 * @date: 2018/8/14 15:24
 */
public class InitAndDestroyBean implements InitializingBean,DisposableBean {

    public InitAndDestroyBean() {
        System.out.println("----------构造方法InitAndDestroyBean执行----------");
    }

    public void init(){
        System.out.println("----------init-methodz执行----------");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("----------DisposableBean接口的destroy方法执行----------");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("----------InitializingBean接口的afterPropertiesSet方法执行----------");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("----------@PostConstruct注解的postConstruct方法执行----------");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("----------@PreDestroy注解的preDestroy方法执行----------");
    }
}
