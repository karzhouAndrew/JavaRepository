package lab54;

/**
 * Сделать сервлет, который по содержимому User-Agent будет определять с помощью какого браузера зашел пользователь,
 * и выводить сообщение вида: Приветствую пользователя Firefox.
 */

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@WebServlet(name = "FirstServlet")
public class FirstServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userAgent = request.getHeader("user-agent");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>First Servlet</title></head>");
        out.println("<body><div align='center' style='margin-top: 250px;'>");
        if (userAgent.contains("MSIE")) {
            out.println("Welcome Internet Explorer user" + "<br>");
        } else if (userAgent.contains("Opera") || userAgent.contains("OPR")) {
            out.println("Welcome Opera user" + "<br>");
        } else if (userAgent.contains("Chrome")) {
            out.println("Welcome Google Chrome user" + "<br>");
        } else if (userAgent.contains("Firefox")) {
            out.println("Welcome Mozilla Firefox user" + "<br>");
        }
        out.println("</div></body></html>");
    }
}
