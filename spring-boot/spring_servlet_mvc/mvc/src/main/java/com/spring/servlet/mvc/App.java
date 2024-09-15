package com.spring.servlet.mvc;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class App {
    public static void main(String[] args) throws LifecycleException {
        System.out.println("Starting Tomcat server...");

        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8081); // Ensure this port is not used by another application

        // Add a context with root path
        Context context = tomcat.addContext("", null);

        // Register the servlet and map it to /hello
        Tomcat.addServlet(context, "HelloServlet", new Helloservlet());
        context.addServletMappingDecoded("/bye", "HelloServlet");

        // Start Tomcat server
        tomcat.start();
        tomcat.getServer().await();
    }
}