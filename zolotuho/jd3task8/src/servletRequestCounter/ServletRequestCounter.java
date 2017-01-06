package servletRequestCounter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//Сделать   простейший   сервлет,   подсчитывающий   количество посещений.
// Т.е.  При  каждом  обращении  к  сервлету,  следует  увеличивать счетчик  посещений,  и  выводить  его  значение  на  страницу.
// Количество следует хранить в файле.

//@javax.servlet.annotation.WebServlet(name = "ServletRequestCounter")
public class ServletRequestCounter extends HttpServlet {
    public void init() {

        try {
            super.init();
            CountFileManager.createFile();
        } catch (ServletException e) {
            e.printStackTrace();
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int number = CountFileManager.incrementRequestQuantity();
        PrintWriter out = response.getWriter();
        request.getServletContext();
        response.setContentType("text/html");
        out.println("<html><head><title>Request counter</title></head>");
        out.println("<body><h1>Click refresh or F5 or Ctrl+F5 to increase counter" + ":  " + number + " " + "</h1>");
        out.println("</body></html>");
        out.close();
    }
}
