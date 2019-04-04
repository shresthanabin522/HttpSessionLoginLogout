import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns="/LoginServlet")
public class LoginServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        PrintWriter printWriter = response.getWriter();
        request.getRequestDispatcher("link.jsp").include(request,response);

        String name = request.getParameter("name");
        String password = request.getParameter("password");

        if(name.equals("admin") && password.equals("admin")){

            printWriter.print("<br> Welcome  "+name);

            HttpSession session = request.getSession(true);
            session.setAttribute("name",name);
            //session.setMaxInactiveInterval(10);

        }
        else {

            printWriter.print("<br>Sorry!! Please enter a valid username and password...");
            request.getRequestDispatcher("login.jsp").include(request,response);
        }
    }
}
