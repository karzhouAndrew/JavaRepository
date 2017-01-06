package lab55;

/**
 * Изменить счетчик из задания 9 так, чтобы значение выводилось в виде изображения.
 */

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

@WebServlet(name = "FirstServlet")
public class FirstServlet extends HttpServlet {
    private static int count;

    public void init() throws ServletException {
        count = 0;
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("image/jpeg");
        BufferedImage image = new BufferedImage(600, 600, BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics = image.createGraphics();
        graphics.setFont(new Font("Serif", Font.ITALIC, 48));
        graphics.setColor(Color.red);
        graphics.drawString(String.valueOf(count), 200, 200);
        ServletOutputStream out = response.getOutputStream();
        ImageIO.write(image, "jpeg", out);
        count++;
    }
}