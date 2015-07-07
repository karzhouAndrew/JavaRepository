package jd03.lab09;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        performAction(request, response);
    }

    private void performAction(HttpServletRequest request, HttpServletResponse response) {
        CounterManager.writeCountFile();
        response.setContentType("text/html");
        try (PrintWriter out = response.getWriter()) {
            out.println("<html><head>");
            out.println("<title>A Hello word servlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Hello word!</h1>");
            out.println("<h5>Number of requests: " + CounterManager.readCountFile() + "</h5>");
            out.println("</body><html>");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
