package com.raaga.cmpe275;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
	
	   public static void main(String[] args) {
	      ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	      HelloGreeter obj = (HelloGreeter) context.getBean("greeter");
	      System.out.println(obj.getGreeting());
	   }
}
