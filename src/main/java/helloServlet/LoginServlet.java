package helloServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public LoginServlet() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // read form data
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // build HTML code
        PrintWriter out = response.getWriter();

        String htmlResponse = "<html>";
        htmlResponse += "<h2> your name is " + username + "<br/>";
        htmlResponse += "<h2> your password is " + password + "<br/>";
        htmlResponse += "</html>";

        out.println(htmlResponse);
    }
}
