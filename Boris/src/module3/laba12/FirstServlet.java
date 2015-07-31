package module3.laba12;

//#8 Набрать приведенный пример, откомпилировать его, разместить на сервере (в т.ч. зарегистрировать в web.xml)
//        и запустить из браузера.
//#9 Сделать простейший сервлет, подсчитывающий количество посещений. Т.е. При каждом обращении к сервлету,
// следует увеличивать счетчик посещений, и выводить его значение на страницу. Количество следует хранить в файле.
//#12 Изменить счетчик из задания 9 так, чтобы значение выводилось в виде изображения.


import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class FirstServlet extends HttpServlet {
    private static int visitors = 0;
    private static final File FILE_TO_SAVE = new File("visitors/visitors.txt");

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        performAction(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        performAction(request, response);
    }

    private void performAction(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        writeVisitors(response);
        drawVisitors(response);
    }

    private void drawVisitors(HttpServletResponse response) {
        response.setContentType("image/jpeg");
        BufferedImage bufferedImage = new BufferedImage(500, 200, BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics2D = bufferedImage.createGraphics();
        graphics2D.setFont(new Font("Monospaced", Font.BOLD, 48));
        graphics2D.setColor(Color.blue);
        graphics2D.drawString("You are " + getVisitors() + " visitors.", 100, 100);
        try (ServletOutputStream servletOutputStream = response.getOutputStream()) {
            ImageIO.write(bufferedImage, "jpeg", servletOutputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void writeVisitors(HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head>");
        out.println("<titel>A hello World Servlet!</titel>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Hello World!</h1>");
        out.println("<p>There are " + getVisitors() + " visitors now!</p>");
        out.println("</body>");
        out.close();
    }

    private String getVisitors() {
        String text = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_TO_SAVE))) {
            text = reader.readLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        writeVisitorsToFile();
        super.service(req, resp);
    }

    private void writeVisitorsToFile() throws IOException {
        if (!FILE_TO_SAVE.exists()) {
            FILE_TO_SAVE.getParentFile().mkdirs();
        }
        Lock lock = new ReentrantLock();
        try {
            lock.tryLock();
            try (PrintWriter writer = new PrintWriter(new BufferedOutputStream(new FileOutputStream(FILE_TO_SAVE)))) {
                writer.println(++visitors);
                writer.flush();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } finally {
            lock.unlock();
        }
    }
}
