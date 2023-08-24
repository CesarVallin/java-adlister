import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/count")
public class CountPage extends HttpServlet {

    private static int count = 0;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        count++;
        String countInQuery = req.getParameter("count");

        if(countInQuery == null || countInQuery.equals("")) {
            resp.getWriter().println("<h1>" + count + "</h1>\n<form action='/'><button>Back Home?</button></form>");
        } else {
            count = 0;
            resp.getWriter().println("<h1>" + countInQuery + "</h1>\n<form action='/'><button>Back Home?</button></form>");
        }



    }
}
