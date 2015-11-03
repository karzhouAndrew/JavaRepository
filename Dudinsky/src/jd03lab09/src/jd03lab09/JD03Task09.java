package jd03lab09;

/* Задание  9. Сделать простейший сервлет, подсчитывающий количество посещений.
Т.е. При каждом обращении к сервлету, следует увеличивать счетчик посещений,
и выводить его значение на страницу. Количество следует хранить в файле.

УТОЧНЯЮ ЗАДАНИЕ:
Сервлет считает не посещения, а ПРОСМОТРЫ СТРАНИЦЫ (pageview в терминах Google Analytics), которые учитываются
каждый раз, когда страница сайта загружается. Посещение - (термин visit) — это сессия взаимодействия между веб-браузером и веб-сайтом.
Полагаю, что точнее так: считает суммарное количество POST и GET запросов, отображая значение на странице. */

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

public class JD03Task09 extends HttpServlet {

    private static final String COUNTER_FILE_PATH = "counter.dat";
    private static volatile int counter;

    @Override
    public void init() throws ServletException {
        super.init();
        File counterFile = new File(COUNTER_FILE_PATH);
        if (!counterFile.exists()) {
            try {
                counterFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try (DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(COUNTER_FILE_PATH)))) {
            if (counterFile.length() != 0) {
                counter = dataInputStream.readInt();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        performAction(request, response);
    }

    private void performAction(HttpServletRequest request, HttpServletResponse response) throws IOException {
        incrementCounter();
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html><html><head lang=\"en\"><meta charset=\"UTF-8\">");
        out.println("<title>Сервлет-счетчик просмотров страницы</title></head>");
        out.println("<body><h1>Сервлет-счетчик просмотров страницы для задания JD03Task08</h1>");
        out.println("<p>Количество просмотров:</p><p>");
        out.println(counter);
        out.println("</p></body></html>");
        out.close();
    }

    private synchronized void incrementCounter() {
        try (
                DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(COUNTER_FILE_PATH)))
        ) {
            dataOutputStream.writeInt(++counter);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        performAction(request, response);
    }
}