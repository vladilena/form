package controller;

import model.entity.Note;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import static controller.RegexContainer.*;

public class RegistrationFormServlet extends HttpServlet {
    private static String index = "main.jsp";
    List<Note> list = new ArrayList();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("list", list);
        req.getRequestDispatcher(index).forward(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (!requestIsValid(req)) {
            doGet(req, resp);
        }
        final String firstName = req.getParameter("firstName");
        final String login = req.getParameter("login");
        final String comment = req.getParameter("comment");
        final String homePhoneNumber = req.getParameter("homePhoneNumber");
        final Note note = new Note();
        note.setFirstName(firstName);
        note.setLogin(login);
        note.setComment(comment);
        note.setHomePhoneNumber(homePhoneNumber);

        list.add(note);
        doGet(req, resp);
        System.out.println(list);

    }

    private boolean requestIsValid(HttpServletRequest req) {
        final String firstName = req.getParameter("firstName");
        final String login = req.getParameter("login");
        final String comment = req.getParameter("comment");
        final String homePhoneNumber = req.getParameter("homePhoneNumber");

        return firstName != null && firstName.length() > 0 && firstName.matches(REGEX_NAME_LAT) &&
                login != null && login.length() > 0 && login.matches(REGEX_LOGIN) &&
                comment != null && comment.length() > 0 && comment.matches(REGEX_COMMENT) &&
                homePhoneNumber != null && homePhoneNumber.length() > 0 && homePhoneNumber.matches(REGEX_PHONE_NUMBER);
    }


}


