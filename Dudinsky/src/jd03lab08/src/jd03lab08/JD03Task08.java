package jd03lab08;

/* Задание  8. Набрать приведенный пример, откомпилировать его, разместить на сервере
(в т.ч. зарегистрировать в web.xml) и запустить из браузера. */

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class JD03Task08 extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        performAction(request, response);
    }

    private void performAction(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html><html><head lang=\"en\"><meta charset=\"UTF-8\">");
        out.println("<title>First Servlet - for JD03Task08</title></head>");
        out.println("<body><h1>This is text inside h1-tag</h1>");
        out.println("<p>This is text inside p-tag</p>");
        out.println("</body></html>");
        out.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        performAction(request, response);
    }
}
