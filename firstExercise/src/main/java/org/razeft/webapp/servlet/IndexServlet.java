package org.razeft.webapp.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/index.html")
public class IndexServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
            ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String firstName = req.getParameter("name");
        String lastName = req.getParameter("lastName");

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("    <head>");
        out.println("        <meta charset=\"UTF-8\">");
        out.println("        <title>Exercise 1: Servlet and Send of params</title>");
        out.println("    </head>");
        out.println("    <body>");
        out.println("        <h1>Exercise 1: Servlet and Send of params</h1>");

        if(firstName != null && lastName != null){
            out.println("        <h2>Your name complete is: " + firstName + " " + lastName + "</h2>");
        } else if(firstName != null) {
            out.println("        <h2>Your name is: " + firstName + "</h2>");
        } else if(lastName != null) {
            out.println("        <h2>Your last name is: " + lastName + "</h2>");
        } else {
            out.println("        <h2> You don't provide any data</h2>");
        }

        DateFormat df = new SimpleDateFormat("dd 'of' MMMM, yyyy ");
        String actualDate = df.format(new Date());

        out.println("<h3>Actual Date is: " + actualDate +  "</h3>");
        out.println("    </body>");
        out.println("</html>");
        out.close();
    }
}
