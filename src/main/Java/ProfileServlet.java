import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/ProfileServlet")
public class ProfileServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        PrintWriter printWriter = response.getWriter();

        request.getRequestDispatcher("link.jsp").include(request, response);
        HttpSession session = request.getSession(true);

        if (session != null && session.getAttribute("name")!=null) {
            String name = (String) session.getAttribute("name");
            printWriter.print("<br>Hello, " + name + " Welcome to Profile");

        } else {
            printWriter.print("<br>Please login first!!!...");
            request.getRequestDispatcher("login.jsp").include(request, response);
        }

    }
}
