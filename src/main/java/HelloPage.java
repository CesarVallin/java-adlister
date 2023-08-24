import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/hello")
public class HelloPage extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nameInQuery = req.getParameter("name");
        if (nameInQuery == null || nameInQuery.equals("")) {
            resp.getWriter().println("<h1>HELLO, WORLD!</h1>\n<form action='/'><button>Back Home?</button></form>");
        } else {
            resp.getWriter().println("<h1>" + nameInQuery + "</h1>\n<form action='/'><button>Back Home?</button></form>");
        }
    }
}
