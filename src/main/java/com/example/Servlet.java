package com.example;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DevOpsLab4Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        response.getWriter().println("<html><head><title>DevOps Lab 4</title></head><body>");
        response.getWriter().println("<h1>DevOps Lab 4 - Java Servlet</h1>");
        response.getWriter().println("<p><strong>Name:</strong> Batman</p>");
        response.getWriter().println("<p><strong>Roll Number:</strong> 2021wa000000</p>");
        response.getWriter().println("<p><strong>Subject:</strong> DevOps Lab 4</p>");
        response.getWriter().println("<hr>");
        response.getWriter().println("<p>This servlet demonstrates dynamic content generation using Java.</p>");
        response.getWriter().println("</body></html>");
    }
}
