package controller;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class ServletRequestCountHandler extends HttpServlet {
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
        request.getServletContext();
        ServletOutputStream out = response.getOutputStream();
        response.setContentType("image/jpeg");
        BufferedImage image = new BufferedImage(250, 200, BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics2D = image.createGraphics();
        graphics2D.setFont(new Font("TimesNewRoman", Font.BOLD, 50));
        int number = CountFileManager.incrementRequestQuantity();
        graphics2D.setColor(Color.red);
        graphics2D.drawString(Integer.toString(number), 100, 100);
        ImageIO.write(image, "jpeg", out);
        out.close();
    }
}
