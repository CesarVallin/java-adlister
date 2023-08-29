import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet("/guess")
public class Guess extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/guess.jsp").forward(req, resp);
        //

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String guessedNumberRequest = req.getParameter("guessNumber");
        int guessNumber;
        try {
            guessNumber = Integer.parseInt(guessedNumberRequest);
        } catch(NumberFormatException e) {
            resp.sendRedirect("/guess?error=invalid");
            return;
        }

        if (guessNumber != 1 && guessNumber != 2 && guessNumber != 3) {
            resp.sendRedirect("/guess");
            return;
        }


        Random random = new Random();
        int randomValue = random.nextInt(3) + 1;

        if (guessNumber == randomValue) {
            resp.sendRedirect("/correct");
        } else {
            resp.sendRedirect("/incorrect");
        }

    }


}
