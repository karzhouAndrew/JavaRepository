package lab10;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        performAction(request, response);
    }

    private void performAction(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        User user = new User(name, phone, email);
        if (isValidInput(user)) {
            performView(user, response);
        } else {
            performError(request, response);
        }
    }

    private void performError(HttpServletRequest request, HttpServletResponse response) {
        try (PrintWriter out = response.getWriter()) {
            response.setContentType("text/html");
            out.println("<html><head>");
            out.println("<title>Lab10</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Error</h1><br>");
            out.println("<form action=\"index.jsp\" method=\"get\">");
            out.println("<input name=\"go\" type=\"submit\" value=\"Try again\">");
            out.println("</form>");
            out.println("</body><html>");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void performView(User user, HttpServletResponse response) {
        try (PrintWriter out = response.getWriter()) {
            response.setContentType("text/html");
            out.println("<html><head>");
            out.println("<title>Lab10</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>User data</h1><br>");
            out.println("<h5>" + user.getName() + "</h5><br>");
            out.println("<h5>" + user.getPhone() + "</h5><br>");
            out.println("<h5>" + user.getEmail() + "</h5><br>");
            out.println("</body><html>");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private boolean isValidInput(User user) {
        boolean validInput = false;
        if ((user.getName() != "") && (user.getPhone() != "") && (user.getEmail() != "")) {
            validInput = true;
        }
        return validInput;
    }
}
