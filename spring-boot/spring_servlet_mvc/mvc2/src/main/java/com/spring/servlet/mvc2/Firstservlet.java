package com.spring.servlet.mvc2;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Firstservlet  extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        System.out.println("In Service");
        
        res.setContentType("text/html");
        PrintWriter out = res.getWriter(); 
        out.println("<h1>Hello world</h1>");
    }
}