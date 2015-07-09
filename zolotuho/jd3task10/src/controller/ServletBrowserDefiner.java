package controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@javax.servlet.annotation.WebServlet(name = "BrowserDefiner")
public class ServletBrowserDefiner extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String info = request.getHeader("User-Agent");
        request.getContextPath();
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        if (info.toLowerCase().contains("firefox")) {
            out.println("<h1>Greeting  Firefox user</h1>");
        }
        if (info.toLowerCase().contains("chrome")) {
            out.println("<h1>Greeting  Chrome user</h1>");
        }
        out.close();
    }
}
