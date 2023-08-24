import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/")
public class HelloWorldServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.getWriter().println("<h1><a href='/hello'>Hello</a></h1><form action='/hello'><input name='name'><button>Submit</button></form>");
        res.getWriter().println("\n<h2>Go to count</h2><form action='/count'><input name='count'><p>Enter a custom count</p><button>Submit</button></form>");
    }
}
