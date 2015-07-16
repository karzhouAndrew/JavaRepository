package lab12;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        performAction(request, response);
    }

    private void performAction(HttpServletRequest request, HttpServletResponse response) {
        CounterManager.writeCountFile();
        response.setContentType("image/jpeg");
        BufferedImage image = new BufferedImage(700, 200, BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics = image.createGraphics();
        graphics.setFont(new Font("Serif", Font.ITALIC, 48));
        graphics.setColor(Color.green);
        graphics.drawString("Number of requests: " + CounterManager.readCountFile(), 100, 100);
        try (ServletOutputStream servletOutputStream = response.getOutputStream()) {
            ImageIO.write(image, "jpeg", servletOutputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
