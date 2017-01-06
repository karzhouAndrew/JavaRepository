package controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class ServletContactDataHandler extends HttpServlet {
    private String errorPage="/error.html";
    private String infoPage="/index.jsp";
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getServletContext();
        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        response.setContentType("text/html");
        boolean atLeastOneIsNotEmpty = (phone.isEmpty() ^ email.isEmpty()) || !(phone.isEmpty() || email.isEmpty());
        if (!name.isEmpty() && atLeastOneIsNotEmpty) {
            RequestDispatcher requestDispatcher=getServletContext().getRequestDispatcher(infoPage);
            requestDispatcher.include(request, response);
        } else {
            RequestDispatcher requestDispatcher=getServletContext().getRequestDispatcher(errorPage);
            requestDispatcher.include(request, response);
        }
    }
}
