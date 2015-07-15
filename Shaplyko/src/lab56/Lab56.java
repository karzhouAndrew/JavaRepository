package lab56;


/**
 * Изменить счетчик из задания 9 так, чтобы подсчитывались только уникальные посещения за сутки. Для контроля,
 * был ли данный пользователь в течение последних суток на сайте использовать куки.
 */

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@WebServlet(name = "Lab56")
public class Lab56 extends HttpServlet {
    private static final String FILE_NAME = "./countFile.txt";
    private static int count;
    private static String cookieValue = "";
    private static String cookieName = "visit";

    @Override
    public void init() throws ServletException {
        count = 0;
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        cookieValue = getCookie(request);
        establishCookie(response);

        PrintWriter out = response.getWriter();
        out.println("<html><head><title>First     Servlet</title></head>");
        out.println("<body><h1>This is First Servlet</h1>");
        out.println("<h1>Count " + count + "</h1>");
        out.println("<h1>Cookie name:  " + cookieName + "</h1>");
        out.println("<p align = left> Cookie value:  " + cookieValue + "</p>");
        out.println("</body></html>");
        out.close();
        writeFile(count);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    private void writeFile(int count) {
        try (PrintWriter writer = new PrintWriter(new BufferedOutputStream(new FileOutputStream(getServletContext().getRealPath(FILE_NAME), true)))) {
            writer.println(count);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("File not written.");
        }
    }

    private String getCookie(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        String value = "";
        if (cookies != null) {
            for (int i = 0; i < cookies.length; i++) {
                Cookie cookie = cookies[i];
                if (cookieName.equals(cookie.getName())) {
                    value = cookie.getValue();
                    break;
                }
            }
        }
        return value;
    }

    private void establishCookie(HttpServletResponse response) {
        if (cookieValue == "") {
            Cookie cookie = new Cookie("visit", "the user has already been");
            cookie.setMaxAge(24 * 60 * 60);
            response.addCookie(cookie);
            count++;
        }
    }
}
