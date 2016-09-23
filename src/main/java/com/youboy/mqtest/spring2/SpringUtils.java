package com.youboy.mqtest.spring2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/** 
 * @author hailin
 * @version 1.0
 * @date 2016年5月12日 上午9:53:55 
 * 类说明 :
 */

public class SpringUtils {

	private static ApplicationContext applicationContext;

	public static ApplicationContext getApplicationContext() {
		if(applicationContext == null){
			applicationContext = new ClassPathXmlApplicationContext("classpath:/META-INF/spring/applicationContext-jms2.xml");
		}
		
		return applicationContext;
	}

}


