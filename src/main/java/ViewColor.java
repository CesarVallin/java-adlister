import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/viewcolor")
public class ViewColor extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String backgroundColor = req.getParameter("colorInput");
        System.out.println(backgroundColor);
        req.setAttribute("backgroundColor", backgroundColor);
        // The first parameter (in quotes) will be the variable name within the JSP.

        req.getRequestDispatcher("viewcolor.jsp").forward(req, resp);
        // this is needed to know where to post it!
    }
}
