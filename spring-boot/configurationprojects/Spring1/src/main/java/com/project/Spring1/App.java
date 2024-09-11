package com.project.Spring1;

import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * XML- BAsed Configuration
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	
    	Alien a = (Alien) context.getBean("alien");
    	a.code();

    	System.out.println("Defalut value: "+a.getName());
//    	
//    	a.setName("sahil");
//    	System.out.println("Set value: "+a.getName());
//    	
 
    }
}
