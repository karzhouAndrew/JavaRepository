package jd03lab12;

/* Задание  12. Изменить счетчик из задания 9 так, чтобы значение выводилось в виде изображения. */

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

public class RasterizedPageViewsCounter extends HttpServlet {

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

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        performAction(request, response);
    }

    private void performAction(HttpServletRequest request, HttpServletResponse response) throws IOException {
        incrementCounter();
        response.setContentType("image/jpeg");
        BufferedImage image = new BufferedImage(180, 45, BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics = image.createGraphics();
        graphics.setFont(new Font("Verdana", Font.BOLD, 24));
        graphics.setColor(Color.ORANGE);
        graphics.drawString(Integer.toString(counter), 15, 30);
        ServletOutputStream out = response.getOutputStream();
        ImageIO.write(image, "jpeg", out);
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

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        performAction(request, response);
    }
}