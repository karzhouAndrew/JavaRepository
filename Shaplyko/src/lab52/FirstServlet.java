package lab52;

/**
 * Сделать простейший сервлет, подсчитывающий количество посещений. Т.е. При каждом обращении к сервлету,
 * следует увеличивать счетчик посещений, и выводить его значение на страницу. Количество следует хранить в файле.
 */

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@WebServlet(name = "FirstServlet")
public class FirstServlet extends HttpServlet {
    private static final String FILE_NAME = "./countFile.txt";
    private static final long serialVersionUID = 1L;
    private static int count = 0;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        out.println("<html><head><title>First     Servlet</title></head>");
        out.println("<body><h1>This is First Servlet</h1>");
        out.println("<body><h1>Count " + count + "</h1>");
        out.println("</body></html>");
        writeFile(count);
        count++;
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
}
