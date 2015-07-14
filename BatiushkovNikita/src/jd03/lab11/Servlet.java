package lab11;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "Servlet", urlPatterns = "/*")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        performAction(request, response);
    }

    private void performAction(HttpServletRequest request, HttpServletResponse response) {
        try (PrintWriter out = response.getWriter()) {
            response.setContentType("text/html");
            out.println("<html><head>");
            out.println("<meta charset = \"utf-8\">");
            out.println("<title>Lab11</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Welcome User " + getBrowserName(request) + "</h1><br>");
            out.println("</body><html>");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String getBrowserName(HttpServletRequest request) {
        String browserName;
        String userAgent = request.getHeader("User-Agent").toLowerCase();
        if (userAgent.contains("opera")) {
            browserName = "Opera";
        } else if (userAgent.contains("mozilla") && (userAgent.contains("firefox"))) {
            browserName = "Firefox";
        } else {
            browserName = "Chrome";
        }
        return browserName;
    }
}
