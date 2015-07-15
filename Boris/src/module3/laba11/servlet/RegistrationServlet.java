package module3.laba11.servlet;


//#10 Создать форму с вводом имени, телефона и электронной почты. Создать сервлет, который будет получать эти данные,
//        и распечатывать на странице. Если пользователь не ввел имя, или одновременно пропущены телефон
//        и электронная почта, следует выводить сообщение об ошибке.
//#11 Сделать сервлет, который по содержимому User-Agent будет определять с помощью какого браузера зашел пользователь,
// и выводить сообщение вида: Приветствую пользователя Firefox.


import module3.laba11.servlet.record.Record;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.regex.Pattern;

public class RegistrationServlet extends HttpServlet {
    private static final String FIREFOX = "firefox";
    private static final String OPERA = "opera";
    private static final String CHROME = "chrome";
    private String referer;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Record record = new Record();
        record.setName(req.getParameter("name"));
        record.setPhoneNumber(req.getParameter("telephone"));
        record.setEmail(req.getParameter("e-mail"));
        PrintWriter writer = resp.getWriter();
        resp.setContentType("text/html");
        referer = req.getHeader("Referer");
        if (record.getEmail().length() == 0 && record.getPhoneNumber().length() == 0) {
            createAlert(writer);
        } else {
            writer.write("<h4>Special information</h4>");
            Enumeration<String> enumeration = req.getHeaderNames();
            while (enumeration.hasMoreElements()) {
                String name = enumeration.nextElement();
                writer.write(name + " " + req.getHeader(String.valueOf(name)) + "<br>");
            }
            writer.write("<hr>");
            writer.write("user-agent is " + req.getHeader("User-Agent"));
            writeGreeting(writer, req.getHeader("User-Agent"));
            makeResponse(record, writer);
        }
        writer.close();
    }

    private void writeGreeting(PrintWriter writer, String browser) {
        writer.append("<br><p>Hello  user ");
        if (Pattern.compile(FIREFOX).matcher(browser.toLowerCase()).find()){
            writer.append(FIREFOX);
        } else if (Pattern.compile(OPERA).matcher(browser.toLowerCase()).find()){
            writer.append(OPERA);
        } else if (Pattern.compile(CHROME).matcher(browser.toLowerCase()).find()){
            writer.append(CHROME);
        }
        writer.append(".</p>");
    }

    private void createAlert(PrintWriter writer) {
        writer.println("<script type=\"text/javascript\">");
        writer.println("alert('Your must write telephone or e-mail, please.');");
        writer.println("location='form_registration.jsp';");
        writer.println("</script>");
    }

    private void makeResponse(Record record, PrintWriter writer) throws IOException {
            writer.write("<p>Entered data is :<br>");
            writer.write("Name is " + record.getName() + "<br>");
            if (record.getEmail().length() != 0) {
                writer.write("E-mail is " + record.getEmail() + "<br>");
            }
            if (record.getPhoneNumber().length() != 0) {
                writer.write("Phone number is " + record.getPhoneNumber() + "</p>");
            }
            writer.write("<br><a href=\"" + referer + "\">return</a>");
    }
}
