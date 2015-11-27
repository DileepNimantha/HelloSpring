package com.dileep;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		AbstractApplicationContext context2 = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld obj = (HelloWorld) context2.getBean("helloWorld");
		obj.getMessage();
		context2.registerShutdownHook();
	}
}
