package org.razeft.apiservlet.webapp.form;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet({"/create", ""})
public class RegisterProductServlet extends HttpServlet {

    Map<String, String> errors = new HashMap<>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/form.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String name = req.getParameter("name");
        int price = Integer.parseInt(req.getParameter("price"));
        String manufacturer = req.getParameter("manufacturer");

        if(name == null || name.isEmpty()){
            errors.put("name", "The name must to be valid!");
        }

        if(price < 0 ){
            errors.put("price", "Price must to be greater than 0");
        }

        if(manufacturer == null || manufacturer.isEmpty()
                || (manufacturer.length() < 4 || manufacturer.length() > 10)) {
            errors.put("manufacturer", "The manufacturer must to be valid!");
        }

        resp.setContentType("text/html");

        if(errors.isEmpty()) {
            try (PrintWriter out = resp.getWriter()) {

                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("    <head>");
                out.println("        <meta charset=\"UTF-8\">");
                out.println("        <title>Product Register: " + name + "</title>");
                out.println("    </head>");
                out.println("    <body>");
                out.println("        <h1>Here your product</h1>");
                out.println("        <ul>");
                out.println("            <li>Name: " + name + "</li>");
                out.println("            <li>Price: " + price + "$</li>");
                out.println("            <li>Manufacturer: " + manufacturer + "</li>");
                out.println("        </ul>");
                out.println("    </body>");
                out.println("</html>");
            }
        } else {
            req.setAttribute("errors", errors);
            getServletContext().getRequestDispatcher("/form.jsp").forward(req, resp);
        }
    }
}
