package com.spring.servlet.mvc2;


import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class App {
    public static void main(String[] args) throws  LifecycleException {
    System.out.println("Starting Tomcat server...");

    Tomcat tomcat = new Tomcat();
    tomcat.start();
    tomcat.getServer().await();
    
    Context context = tomcat.addContext("", null);
    Tomcat.addServlet(context,"firstservlet",new Firstservlet());
    context.addServletMappingDecoded("/hello","firstservlet");
    
    tomcat.start();
    tomcat.getServer().await();
}
}