package com.carvendy.mqtest.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*
 *   http://www.cnblogs.com/xwdreamer/archive/2012/02/27/2369967.html
 * 
 */
public class JMSTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
    	ApplicationContext applicationContext = SpringUtils.getApplicationContext();
    	ProxyJMSConsumer proxyJMSConsumer = (ProxyJMSConsumer) applicationContext.getBean("messageReceiver");
        proxyJMSConsumer.recive();
        
        System.out.println("初始化消息消费者");
    }
}